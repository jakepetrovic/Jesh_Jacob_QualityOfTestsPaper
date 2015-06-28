package common;

import java.awt.Point;
import java.awt.Rectangle;
import client.ClientBomb;
import server.ServerPlayer;
import server.ServerGameSession;
import org.junit.*;
import server.ServerBomb;
import server.ServerPowerUp;
import static org.junit.Assert.*;

/**
 * The class <code>BombTest</code> contains tests for the class <code>{@link Bomb}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BombTest {
	/**
	 * Run the Bomb(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_1()
		throws Exception {
		Point position = new Point();

		Bomb result = new Bomb(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_2()
		throws Exception {
		Point position = new Point(0, 0);

		Bomb result = new Bomb(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_3()
		throws Exception {
		Point position = new Point(1, 1);

		Bomb result = new Bomb(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_4()
		throws Exception {
		Point position = new Point((Point) null);

		Bomb result = new Bomb(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_5()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ClientBomb(new Point(), (GameObject) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_6()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ClientBomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_7()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Bomb(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_8()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Bomb(new Point(), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_9()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_10()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Player(new Point());

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_11()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new PowerUp(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_12()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Tile(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_13()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerBomb(new Point(), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_14()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ServerBomb(new Point(0, 0), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_15()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ServerPlayer(new Point());

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_16()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ServerPowerUp(new Point(), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_17()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.ServerPowerUp.<clinit>(ServerPowerUp.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_18()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ClientBomb(new Point(), (GameObject) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_19()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ClientBomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_20()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Bomb(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_21()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Bomb(new Point(), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_22()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_23()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Player(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_24()
		throws Exception {
		Point position = new Point();
		GameObject planter = new PowerUp(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_25()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Tile(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_26()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ServerBomb(new Point(), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_27()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ServerBomb(new Point(0, 0), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_28()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerPlayer(new Point());

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_29()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ServerPowerUp(new Point(), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_30()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_31()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ClientBomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

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
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_32()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Bomb(new Point());

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_33()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Bomb(new Point(), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_34()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);

		Bomb result = new Bomb(position, planter);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_35()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ClientBomb(new Point(), (GameObject) null);
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_36()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ClientBomb(new Point(0, 0), (GameObject) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_37()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Bomb(new Point());
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_38()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Bomb(new Point(), (GameObject) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_39()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_40()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Player(new Point());
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_41()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new PowerUp(new Point());
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_42()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Tile(new Point());
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_43()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerBomb(new Point(), (ServerGameSession) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_44()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ServerBomb(new Point(0, 0), (ServerGameSession) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_45()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ServerPlayer(new Point());
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_46()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ServerPowerUp(new Point(), (ServerGameSession) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_47()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_48()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ClientBomb(new Point(0, 0), (GameObject) null);
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_49()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Bomb(new Point());
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_50()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Bomb(new Point(), (GameObject) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_51()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_52()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Player(new Point());
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_53()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new PowerUp(new Point());
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_54()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Tile(new Point());
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_55()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ServerBomb(new Point(), (ServerGameSession) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_56()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new ServerBomb(new Point(0, 0), (ServerGameSession) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

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
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_57()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ServerPlayer(new Point());
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_58()
		throws Exception {
		Point position = new Point();
		GameObject planter = new ServerPowerUp(new Point(), (ServerGameSession) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_59()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new ServerPowerUp(new Point(0, 0), (ServerGameSession) null);
		int type = 1;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_60()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new ClientBomb(new Point(), (GameObject) null);
		int type = 7;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_61()
		throws Exception {
		Point position = new Point();
		GameObject planter = new Bomb(new Point());
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_62()
		throws Exception {
		Point position = new Point(0, 0);
		GameObject planter = new Bomb(new Point(), (GameObject) null);
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_63()
		throws Exception {
		Point position = new Point(1, 1);
		GameObject planter = new Bomb(new Point(0, 0), (GameObject) null);
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the Bomb(Point,GameObject,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBomb_64()
		throws Exception {
		Point position = new Point((Point) null);
		GameObject planter = new Player(new Point());
		int type = 0;

		Bomb result = new Bomb(position, planter, type);

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
		new org.junit.runner.JUnitCore().run(BombTest.class);
	}
}