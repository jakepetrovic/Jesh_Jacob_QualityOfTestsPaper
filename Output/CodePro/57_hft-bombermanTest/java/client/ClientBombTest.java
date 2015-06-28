package client;

import java.awt.Point;
import java.awt.Shape;
import server.ServerBomb;
import server.ServerPowerUp;
import org.junit.*;
import static org.junit.Assert.*;
import common.Bomb;
import common.GameObject;
import server.ServerGameSession;
import common.Player;
import common.PowerUp;
import common.Tile;
import server.ServerPlayer;

/**
 * The class <code>ClientBombTest</code> contains tests for the class <code>{@link ClientBomb}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ClientBombTest {
	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_1()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new ClientBomb(new Point(), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_2()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new ClientBomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_3()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new Bomb(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_4()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new Bomb(new Point(), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_5()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new Bomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_6()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new Player(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_7()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new PowerUp(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_8()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new Tile(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_9()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new ServerBomb(new Point(), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_10()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new ServerBomb(new Point(0, 0), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_11()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new ServerPlayer(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_12()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new ServerPowerUp(new Point(), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_13()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.ServerPowerUp.<clinit>(ServerPowerUp.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_14()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new ClientBomb(new Point(), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_15()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new ClientBomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_16()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new Bomb(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_17()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new Bomb(new Point(), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_18()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new Bomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_19()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new Player(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_20()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new PowerUp(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_21()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new Tile(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_22()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new ServerBomb(new Point(), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_23()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new ServerBomb(new Point(0, 0), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_24()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new ServerPlayer(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_25()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new ServerPowerUp(new Point(), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_26()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_27()
		throws Exception {
		Point position = new Point();
		GameObject gameObject = new ClientBomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_28()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject gameObject = new Bomb(new Point());

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_29()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject gameObject = new Bomb(new Point(), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the ClientBomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testClientBomb_30()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject gameObject = new Bomb(new Point(0, 0), (GameObject) null);

		ClientBomb result = new ClientBomb(position, gameObject);

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
		new org.junit.runner.JUnitCore().run(ClientBombTest.class);
	}
}