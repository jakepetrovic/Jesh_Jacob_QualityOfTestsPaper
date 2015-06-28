package client.view;

import java.awt.Graphics;
import server.ServerPlayer;
import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;
import common.Bomb;
import common.GameObject;
import server.ServerGameSession;
import client.ClientBomb;
import common.Player;
import common.PowerUp;
import common.Tile;
import server.ServerBomb;
import server.ServerPowerUp;

/**
 * The class <code>PowerUpViewTest</code> contains tests for the class <code>{@link PowerUpView}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PowerUpViewTest {
	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_1()
		throws Exception {
		GameObject gameObject = new ClientBomb(new Point(), (GameObject) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_2()
		throws Exception {
		GameObject gameObject = new ClientBomb(new Point((Point) null), (GameObject) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_3()
		throws Exception {
		GameObject gameObject = new Bomb(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_4()
		throws Exception {
		GameObject gameObject = new Bomb(new Point(), (GameObject) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_5()
		throws Exception {
		GameObject gameObject = new Bomb(new Point((Point) null), (GameObject) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_6()
		throws Exception {
		GameObject gameObject = new Player(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

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
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_7()
		throws Exception {
		GameObject gameObject = new PowerUp(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.view.GfxFactory.<init>(GfxFactory.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_8()
		throws Exception {
		GameObject gameObject = new Tile(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at client.view.GfxFactory.<init>(GfxFactory.java:45)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_9()
		throws Exception {
		GameObject gameObject = new ServerBomb(new Point(), (ServerGameSession) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

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
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_10()
		throws Exception {
		GameObject gameObject = new ServerBomb(new Point((Point) null), (ServerGameSession) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_11()
		throws Exception {
		GameObject gameObject = new ServerPlayer(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

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
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_12()
		throws Exception {
		GameObject gameObject = new ServerPowerUp(new Point(), (ServerGameSession) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.ServerPowerUp.<clinit>(ServerPowerUp.java:22)
		assertNotNull(result);
	}

	/**
	 * Run the PowerUpView(GameObject,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testPowerUpView_13()
		throws Exception {
		GameObject gameObject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);
		GfxFactory gfxFactory = new GfxFactory();

		PowerUpView result = new PowerUpView(gameObject, gfxFactory);

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
		new org.junit.runner.JUnitCore().run(PowerUpViewTest.class);
	}
}