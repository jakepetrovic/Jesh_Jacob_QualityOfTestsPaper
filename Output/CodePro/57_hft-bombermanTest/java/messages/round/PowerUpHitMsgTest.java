package messages.round;

import java.util.ArrayList;
import java.util.List;
import client.ClientGameSession;
import client.ClientGameRound;
import javax.swing.ImageIcon;
import client.view.GameCanvas;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PowerUpHitMsgTest</code> contains tests for the class <code>{@link PowerUpHitMsg}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PowerUpHitMsgTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PowerUpHitMsg fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PowerUpHitMsg fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PowerUpHitMsg fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PowerUpHitMsg getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PowerUpHitMsg(1, 0, 0);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PowerUpHitMsg getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PowerUpHitMsg(2, 1, 1);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PowerUpHitMsg
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PowerUpHitMsg getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PowerUpHitMsg(3, 7, 7);
		}
		return fixture3;
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_1()
		throws Exception {
		int type = 1;
		int powerUpID = 0;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_2()
		throws Exception {
		int type = 2;
		int powerUpID = 1;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_3()
		throws Exception {
		int type = 3;
		int powerUpID = 7;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_4()
		throws Exception {
		int type = 1;
		int powerUpID = 0;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_5()
		throws Exception {
		int type = 2;
		int powerUpID = 7;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_6()
		throws Exception {
		int type = 4;
		int powerUpID = 0;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_7()
		throws Exception {
		int type = 1;
		int powerUpID = 1;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_8()
		throws Exception {
		int type = 2;
		int powerUpID = 7;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_9()
		throws Exception {
		int type = 4;
		int powerUpID = 1;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_10()
		throws Exception {
		int type = 1;
		int powerUpID = 7;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_11()
		throws Exception {
		int type = 3;
		int powerUpID = 0;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_12()
		throws Exception {
		int type = 4;
		int powerUpID = 1;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_13()
		throws Exception {
		int type = 1;
		int powerUpID = 7;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_14()
		throws Exception {
		int type = 3;
		int powerUpID = 1;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_15()
		throws Exception {
		int type = 4;
		int powerUpID = 7;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_16()
		throws Exception {
		int type = 2;
		int powerUpID = 0;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_17()
		throws Exception {
		int type = 3;
		int powerUpID = 1;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_18()
		throws Exception {
		int type = 1;
		int powerUpID = 0;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_19()
		throws Exception {
		int type = 2;
		int powerUpID = 1;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_20()
		throws Exception {
		int type = 4;
		int powerUpID = 0;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_21()
		throws Exception {
		int type = 1;
		int powerUpID = 1;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_22()
		throws Exception {
		int type = 3;
		int powerUpID = 0;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_23()
		throws Exception {
		int type = 4;
		int powerUpID = 1;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_24()
		throws Exception {
		int type = 2;
		int powerUpID = 0;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(0, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_25()
		throws Exception {
		int type = 3;
		int powerUpID = 1;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_26()
		throws Exception {
		int type = 4;
		int powerUpID = 7;
		int playerID = 7;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getType());
		assertEquals(7, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_27()
		throws Exception {
		int type = 2;
		int powerUpID = 1;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_28()
		throws Exception {
		int type = 3;
		int powerUpID = 7;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_29()
		throws Exception {
		int type = 1;
		int powerUpID = 1;
		int playerID = 0;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals(0, result.getPlayerID());
		assertEquals(1, result.getPowerUpID());
	}

	/**
	 * Run the PowerUpHitMsg(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPowerUpHitMsg_30()
		throws Exception {
		int type = 2;
		int powerUpID = 7;
		int playerID = 1;

		PowerUpHitMsg result = new PowerUpHitMsg(type, powerUpID, playerID);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getType());
		assertEquals(1, result.getPlayerID());
		assertEquals(7, result.getPowerUpID());
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.GameSession.<clinit>(GameSession.java:20)
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession clientGameSession = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(0, 0));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession clientGameSession = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(0, 0));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture2_2()
		throws Exception {
		PowerUpHitMsg fixture = getFixture2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture3_2()
		throws Exception {
		PowerUpHitMsg fixture = getFixture3();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		ClientGameSession clientGameSession = new ClientGameSession("", list, new ImageIcon(""), 0, 0, 0);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(1, 1));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the void execute(ClientGameRound) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExecute_fixture1_2()
		throws Exception {
		PowerUpHitMsg fixture = getFixture1();
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		list.add("0123456789");
		ClientGameSession clientGameSession = new ClientGameSession("0123456789", list, new ImageIcon("", ""), 1, 1, 1);
		ClientGameRound round = new ClientGameRound(clientGameSession, new GameCanvas(0, 0));

		fixture.execute(round);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientGameSession
	}

	/**
	 * Run the int getPlayerID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPlayerID_fixture1_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture1();

		int result = fixture.getPlayerID();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPlayerID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPlayerID_fixture2_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture2();

		int result = fixture.getPlayerID();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPlayerID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPlayerID_fixture3_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture3();

		int result = fixture.getPlayerID();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getPowerUpID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPowerUpID_fixture1_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture1();

		int result = fixture.getPowerUpID();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPowerUpID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPowerUpID_fixture2_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture2();

		int result = fixture.getPowerUpID();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getPowerUpID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPowerUpID_fixture3_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture3();

		int result = fixture.getPowerUpID();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture1();

		int result = fixture.getType();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture2();

		int result = fixture.getType();

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		PowerUpHitMsg fixture = getFixture3();

		int result = fixture.getType();

		// add additional test code here
		assertEquals(3, result);
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
		new org.junit.runner.JUnitCore().run(PowerUpHitMsgTest.class);
	}
}