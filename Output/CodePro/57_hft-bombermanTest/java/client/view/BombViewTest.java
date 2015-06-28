package client.view;

import java.awt.Graphics;
import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;
import common.Bomb;
import common.GameObject;
import client.ClientBomb;
import common.Player;

/**
 * The class <code>BombViewTest</code> contains tests for the class <code>{@link BombView}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BombViewTest {
	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_1()
		throws Exception {
		Bomb gameObject = new Bomb(new Point());
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertNotNull(result);
	}

	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_2()
		throws Exception {
		Bomb gameObject = new Bomb(new Point(), new ClientBomb(new Point(), (GameObject) null));
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

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
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_3()
		throws Exception {
		Bomb gameObject = new Bomb(new Point(), new ClientBomb(new Point(), (GameObject) null), 0);
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

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
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_4()
		throws Exception {
		Bomb gameObject = new Bomb(new Point(0, 0), new ClientBomb(new Point(0, 0), (GameObject) null));
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

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
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_5()
		throws Exception {
		Bomb gameObject = new Bomb(new Point(0, 0), new ClientBomb(new Point(0, 0), (GameObject) null), 1);
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

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
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertNotNull(result);
	}

	/**
	 * Run the BombView(Bomb,GfxFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testBombView_6()
		throws Exception {
		Bomb gameObject = new Bomb(new Point(1, 1), new Player(new Point()), 7);
		GfxFactory gfxFactory = new GfxFactory();

		BombView result = new BombView(gameObject, gfxFactory);

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
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:449)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
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
		new org.junit.runner.JUnitCore().run(BombViewTest.class);
	}
}