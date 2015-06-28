package messages.round;

import java.util.Vector;
import client.ClientGameRound;
import server.ExplosionBounds;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BombExplodedMsgTest</code> contains tests for the class <code>{@link BombExplodedMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BombExplodedMsgTest {
	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_1()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_2()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		tileHits.add(new Integer(0));
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_3()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_4()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_5()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_6()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		tileHits.add(new Integer(0));
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_7()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_8()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_9()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_10()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		tileHits.add(new Integer(0));
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_11()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_12()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_13()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_14()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		tileHits.add(new Integer(0));
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_15()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_16()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_17()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_18()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_19()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_20()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_21()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_22()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_23()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(0));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_24()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_25()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(0));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_26()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_27()
		throws Exception {
		int bombID = 7;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(0));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		tileHits.add(new Integer(0));
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_28()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_29()
		throws Exception {
		int bombID = 1;
		Vector<Integer> playerHits = new Vector<Integer>();
		Vector<Integer> tileHits = new Vector<Integer>();
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(-1));
		powerupHits.add(new Integer(0));
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = true;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
		assertNotNull(result);
	}

	/**
	 * Run the BombExplodedMsg(int,Vector<Integer>,Vector<Integer>,Vector<Integer>,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombExplodedMsg_30()
		throws Exception {
		int bombID = 0;
		Vector<Integer> playerHits = new Vector<Integer>();
		playerHits.add(new Integer(-1));
		playerHits.add(new Integer(0));
		playerHits.add(new Integer(1));
		Vector<Integer> tileHits = new Vector<Integer>();
		tileHits.add(new Integer(-1));
		Vector<Integer> powerupHits = new Vector<Integer>();
		powerupHits.add(new Integer(1));
		boolean hasAlreadyExploded = false;

		BombExplodedMsg result = new BombExplodedMsg(bombID, playerHits, tileHits, powerupHits, hasAlreadyExploded);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class messages.round.BombExplodedMsg
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
		new org.junit.runner.JUnitCore().run(BombExplodedMsgTest.class);
	}
}