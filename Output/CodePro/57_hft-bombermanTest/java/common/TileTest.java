package common;

import java.awt.Point;
import java.awt.Rectangle;
import server.ServerBomb;
import java.util.ArrayList;
import java.util.Collection;
import server.ServerGameSession;
import client.ClientBomb;
import java.util.HashSet;
import server.ServerPowerUp;
import server.ServerPlayer;
import java.util.LinkedList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TileTest</code> contains tests for the class <code>{@link Tile}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TileTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture6;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture7;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture8;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture9;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture10;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture11;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture12;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture13;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture14;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture15;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture16;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture17;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture18;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture19;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture20;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture21;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture22;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture23;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture24;

	/**
	 * An instance of the class being tested.
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private Tile fixture25;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new Tile(new Point());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new Tile(new Point());
			fixture2.setAccessible(false);
			fixture2.setBombable(false);
			fixture2.setType("");
			fixture2.setVisible(false);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new Tile(new Point());
			fixture3.setAccessible(false);
			fixture3.setBombable(false);
			fixture3.setType("");
			fixture3.setVisible(true);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new Tile(new Point());
			fixture4.setAccessible(false);
			fixture4.setBombable(false);
			fixture4.setType("0123456789");
			fixture4.setVisible(false);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Tile(new Point());
			fixture5.setAccessible(false);
			fixture5.setBombable(false);
			fixture5.setType("0123456789");
			fixture5.setVisible(true);
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Tile(new Point());
			fixture6.setAccessible(false);
			fixture6.setBombable(false);
			fixture6.setType("An��t-1.0.txt");
			fixture6.setVisible(false);
		}
		return fixture6;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture7()
		throws Exception {
		if (fixture7 == null) {
			fixture7 = new Tile(new Point());
			fixture7.setAccessible(false);
			fixture7.setBombable(false);
			fixture7.setType("An��t-1.0.txt");
			fixture7.setVisible(true);
		}
		return fixture7;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture8()
		throws Exception {
		if (fixture8 == null) {
			fixture8 = new Tile(new Point());
			fixture8.setAccessible(false);
			fixture8.setBombable(true);
			fixture8.setType("");
			fixture8.setVisible(false);
		}
		return fixture8;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture9()
		throws Exception {
		if (fixture9 == null) {
			fixture9 = new Tile(new Point());
			fixture9.setAccessible(false);
			fixture9.setBombable(true);
			fixture9.setType("");
			fixture9.setVisible(true);
		}
		return fixture9;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture10()
		throws Exception {
		if (fixture10 == null) {
			fixture10 = new Tile(new Point());
			fixture10.setAccessible(false);
			fixture10.setBombable(true);
			fixture10.setType("0123456789");
			fixture10.setVisible(false);
		}
		return fixture10;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture11()
		throws Exception {
		if (fixture11 == null) {
			fixture11 = new Tile(new Point());
			fixture11.setAccessible(false);
			fixture11.setBombable(true);
			fixture11.setType("0123456789");
			fixture11.setVisible(true);
		}
		return fixture11;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture12()
		throws Exception {
		if (fixture12 == null) {
			fixture12 = new Tile(new Point());
			fixture12.setAccessible(false);
			fixture12.setBombable(true);
			fixture12.setType("An��t-1.0.txt");
			fixture12.setVisible(false);
		}
		return fixture12;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture13()
		throws Exception {
		if (fixture13 == null) {
			fixture13 = new Tile(new Point());
			fixture13.setAccessible(false);
			fixture13.setBombable(true);
			fixture13.setType("An��t-1.0.txt");
			fixture13.setVisible(true);
		}
		return fixture13;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture14()
		throws Exception {
		if (fixture14 == null) {
			fixture14 = new Tile(new Point());
			fixture14.setAccessible(true);
			fixture14.setBombable(false);
			fixture14.setType("");
			fixture14.setVisible(false);
		}
		return fixture14;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture15()
		throws Exception {
		if (fixture15 == null) {
			fixture15 = new Tile(new Point());
			fixture15.setAccessible(true);
			fixture15.setBombable(false);
			fixture15.setType("");
			fixture15.setVisible(true);
		}
		return fixture15;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture16()
		throws Exception {
		if (fixture16 == null) {
			fixture16 = new Tile(new Point());
			fixture16.setAccessible(true);
			fixture16.setBombable(false);
			fixture16.setType("0123456789");
			fixture16.setVisible(false);
		}
		return fixture16;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture17()
		throws Exception {
		if (fixture17 == null) {
			fixture17 = new Tile(new Point());
			fixture17.setAccessible(true);
			fixture17.setBombable(false);
			fixture17.setType("0123456789");
			fixture17.setVisible(true);
		}
		return fixture17;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture18()
		throws Exception {
		if (fixture18 == null) {
			fixture18 = new Tile(new Point());
			fixture18.setAccessible(true);
			fixture18.setBombable(false);
			fixture18.setType("An��t-1.0.txt");
			fixture18.setVisible(false);
		}
		return fixture18;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture19()
		throws Exception {
		if (fixture19 == null) {
			fixture19 = new Tile(new Point());
			fixture19.setAccessible(true);
			fixture19.setBombable(false);
			fixture19.setType("An��t-1.0.txt");
			fixture19.setVisible(true);
		}
		return fixture19;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture20()
		throws Exception {
		if (fixture20 == null) {
			fixture20 = new Tile(new Point());
			fixture20.setAccessible(true);
			fixture20.setBombable(true);
			fixture20.setType("");
			fixture20.setVisible(false);
		}
		return fixture20;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture21()
		throws Exception {
		if (fixture21 == null) {
			fixture21 = new Tile(new Point());
			fixture21.setAccessible(true);
			fixture21.setBombable(true);
			fixture21.setType("");
			fixture21.setVisible(true);
		}
		return fixture21;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture22()
		throws Exception {
		if (fixture22 == null) {
			fixture22 = new Tile(new Point());
			fixture22.setAccessible(true);
			fixture22.setBombable(true);
			fixture22.setType("0123456789");
			fixture22.setVisible(false);
		}
		return fixture22;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture23()
		throws Exception {
		if (fixture23 == null) {
			fixture23 = new Tile(new Point());
			fixture23.setAccessible(true);
			fixture23.setBombable(true);
			fixture23.setType("0123456789");
			fixture23.setVisible(true);
		}
		return fixture23;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture24()
		throws Exception {
		if (fixture24 == null) {
			fixture24 = new Tile(new Point());
			fixture24.setAccessible(true);
			fixture24.setBombable(true);
			fixture24.setType("An��t-1.0.txt");
			fixture24.setVisible(false);
		}
		return fixture24;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Tile
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public Tile getFixture25()
		throws Exception {
		if (fixture25 == null) {
			fixture25 = new Tile(new Point());
			fixture25.setAccessible(true);
			fixture25.setBombable(true);
			fixture25.setType("An��t-1.0.txt");
			fixture25.setVisible(true);
		}
		return fixture25;
	}

	/**
	 * Run the Tile(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		Point p = new Point();

		Tile result = new Tile(p);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isAccessible());
		assertEquals(null, result.getType());
		assertEquals(1.0, result.getSpeedFactor(), 1.0);
		assertEquals(true, result.isAccessable());
		assertEquals(true, result.isVisible());
		assertEquals(false, result.isBombable());
		assertEquals(0, result.getId());
		assertEquals(true, result.isActive());
		assertEquals(0, result.countObservers());
		assertEquals(false, result.hasChanged());
	}

	/**
	 * Run the Tile(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		Point p = new Point((Point) null);

		Tile result = new Tile(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		GameObject gameobject = new ClientBomb(new Point(), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		GameObject gameobject = new ClientBomb(new Point((Point) null), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		GameObject gameobject = new Bomb(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		GameObject gameobject = new Bomb(new Point(), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		GameObject gameobject = new Bomb(new Point((Point) null), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		GameObject gameobject = new Player(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		GameObject gameobject = new PowerUp(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		GameObject gameobject = new Tile(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		GameObject gameobject = new ServerBomb(new Point(), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		GameObject gameobject = new ServerBomb(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		GameObject gameobject = new ServerPlayer(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:311)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		GameObject gameobject = new ServerPowerUp(new Point(), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		GameObject gameobject = new ServerPowerUp(new Point((Point) null), (ServerGameSession) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		GameObject gameobject = new ClientBomb(new Point(), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		GameObject gameobject = new ClientBomb(new Point((Point) null), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		GameObject gameobject = new Bomb(new Point());

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		GameObject gameobject = new Bomb(new Point(), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
		assertTrue(result);
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testCollide_fixture6_2()
		throws Exception {
		Tile fixture = getFixture6();
		GameObject gameobject = new Bomb(new Point((Point) null), (GameObject) null);

		boolean result = fixture.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDestroy_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testDie_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		fixture.die();

		// add additional test code here
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		Rectangle result = fixture.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-20.0, result.getY(), 1.0);
		assertEquals(-20.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-20,y=-20,width=40,height=40]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(40.0, result.getHeight(), 1.0);
		assertEquals(40.0, result.getWidth(), 1.0);
		assertEquals(20.0, result.getMaxX(), 1.0);
		assertEquals(20.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-20.0, result.getMinX(), 1.0);
		assertEquals(-20.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getSpeedFactor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetSpeedFactor_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		double result = fixture.getSpeedFactor();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		String result = fixture.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetType_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		String result = fixture.getType();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessable_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		boolean result = fixture.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isAccessible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsAccessible_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		boolean result = fixture.isAccessible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isBombable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsBombable_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		boolean result = fixture.isBombable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsVisible_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		boolean a = true;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setAccessible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetAccessible_fixture6_2()
		throws Exception {
		Tile fixture = getFixture6();
		boolean a = false;

		fixture.setAccessible(a);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		boolean b = true;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setBombable(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetBombable_fixture6_2()
		throws Exception {
		Tile fixture = getFixture6();
		boolean b = false;

		fixture.setBombable(b);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		String type = "";
		boolean accessible = false;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		String type = "0123456789";
		boolean accessible = true;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		String type = "0123456789";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture1_2()
		throws Exception {
		Tile fixture = getFixture1();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		String type = "";
		boolean accessible = false;
		boolean bombable = true;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		String type = "";
		boolean accessible = false;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		String type = "0123456789";
		boolean accessible = true;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture7_2()
		throws Exception {
		Tile fixture = getFixture7();
		String type = "";
		boolean accessible = true;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture8_2()
		throws Exception {
		Tile fixture = getFixture8();
		String type = "";
		boolean accessible = true;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setProperties(String,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetProperties_fixture9_2()
		throws Exception {
		Tile fixture = getFixture9();
		String type = "";
		boolean accessible = true;
		boolean bombable = false;

		fixture.setProperties(type, accessible, bombable);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		String type = "0123456789";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetType_fixture6_2()
		throws Exception {
		Tile fixture = getFixture6();
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		boolean visible = true;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void setVisible(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture6_2()
		throws Exception {
		Tile fixture = getFixture6();
		boolean visible = false;

		fixture.setVisible(visible);

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdate_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture1_1()
		throws Exception {
		Tile fixture = getFixture1();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.Actor.<clinit>(Actor.java:16)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture2_1()
		throws Exception {
		Tile fixture = getFixture2();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));
		gameObjects.add(new ClientBomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Bomb(new Point()));
		gameObjects.add(new Bomb(new Point(), (GameObject) null));
		gameObjects.add(new Bomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Player(new Point()));
		gameObjects.add(new PowerUp(new Point()));
		gameObjects.add(new Tile(new Point()));
		gameObjects.add(new ServerBomb(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerBomb(new Point((Point) null), (ServerGameSession) null));
		gameObjects.add(new ServerPlayer(new Point()));
		gameObjects.add(new ServerPowerUp(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerPowerUp(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture3_1()
		throws Exception {
		Tile fixture = getFixture3();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ClientBomb(new Point((Point) null), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture4_1()
		throws Exception {
		Tile fixture = getFixture4();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Bomb(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture5_1()
		throws Exception {
		Tile fixture = getFixture5();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Bomb(new Point(), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture6_1()
		throws Exception {
		Tile fixture = getFixture6();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Bomb(new Point((Point) null), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture7_1()
		throws Exception {
		Tile fixture = getFixture7();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Player(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture8_1()
		throws Exception {
		Tile fixture = getFixture8();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new PowerUp(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture9_1()
		throws Exception {
		Tile fixture = getFixture9();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new Tile(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture10_1()
		throws Exception {
		Tile fixture = getFixture10();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ServerBomb(new Point(), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture11_1()
		throws Exception {
		Tile fixture = getFixture11();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ServerBomb(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture12_1()
		throws Exception {
		Tile fixture = getFixture12();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ServerPlayer(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture13_1()
		throws Exception {
		Tile fixture = getFixture13();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ServerPowerUp(new Point(), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class org.apache.log4j.LogManager
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at server.ServerPowerUp.<clinit>(ServerPowerUp.java:22)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture14_1()
		throws Exception {
		Tile fixture = getFixture14();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ServerPowerUp(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture15_1()
		throws Exception {
		Tile fixture = getFixture15();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture16_1()
		throws Exception {
		Tile fixture = getFixture16();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));
		gameObjects.add(new ClientBomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Bomb(new Point()));
		gameObjects.add(new Bomb(new Point(), (GameObject) null));
		gameObjects.add(new Bomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Player(new Point()));
		gameObjects.add(new PowerUp(new Point()));
		gameObjects.add(new Tile(new Point()));
		gameObjects.add(new ServerBomb(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerBomb(new Point((Point) null), (ServerGameSession) null));
		gameObjects.add(new ServerPlayer(new Point()));
		gameObjects.add(new ServerPowerUp(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerPowerUp(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture17_1()
		throws Exception {
		Tile fixture = getFixture17();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ClientBomb(new Point((Point) null), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture18_1()
		throws Exception {
		Tile fixture = getFixture18();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new Bomb(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture19_1()
		throws Exception {
		Tile fixture = getFixture19();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new Bomb(new Point(), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class common.Bomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture20_1()
		throws Exception {
		Tile fixture = getFixture20();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new Bomb(new Point((Point) null), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture21_1()
		throws Exception {
		Tile fixture = getFixture21();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new Player(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture22_1()
		throws Exception {
		Tile fixture = getFixture22();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new PowerUp(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture23_1()
		throws Exception {
		Tile fixture = getFixture23();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new Tile(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture24_1()
		throws Exception {
		Tile fixture = getFixture24();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ServerBomb(new Point(), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Bomb
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture25_1()
		throws Exception {
		Tile fixture = getFixture25();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ServerBomb(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture1_2()
		throws Exception {
		Tile fixture = getFixture1();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ServerPlayer(new Point()));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: common.Actor
		//       at java.lang.Class.getDeclaredConstructors0(Native Method)
		//       at java.lang.Class.privateGetDeclaredConstructors(Class.java:2585)
		//       at java.lang.Class.getConstructor0(Class.java:2885)
		//       at java.lang.Class.getDeclaredConstructor(Class.java:2058)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.findConstructor(InstanceCreationExpression.java:572)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:452)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:745)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture2_2()
		throws Exception {
		Tile fixture = getFixture2();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ServerPowerUp(new Point(), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class server.ServerPowerUp
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture3_2()
		throws Exception {
		Tile fixture = getFixture3();
		HashSet<GameObject> gameObjects = new HashSet<GameObject>();
		gameObjects.add(new ServerPowerUp(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture4_2()
		throws Exception {
		Tile fixture = getFixture4();
		LinkedList<GameObject> gameObjects = new LinkedList<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture5_2()
		throws Exception {
		Tile fixture = getFixture5();
		LinkedList<GameObject> gameObjects = new LinkedList<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));
		gameObjects.add(new ClientBomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Bomb(new Point()));
		gameObjects.add(new Bomb(new Point(), (GameObject) null));
		gameObjects.add(new Bomb(new Point((Point) null), (GameObject) null));
		gameObjects.add(new Player(new Point()));
		gameObjects.add(new PowerUp(new Point()));
		gameObjects.add(new Tile(new Point()));
		gameObjects.add(new ServerBomb(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerBomb(new Point((Point) null), (ServerGameSession) null));
		gameObjects.add(new ServerPlayer(new Point()));
		gameObjects.add(new ServerPowerUp(new Point(), (ServerGameSession) null));
		gameObjects.add(new ServerPowerUp(new Point((Point) null), (ServerGameSession) null));

		fixture.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
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
		new org.junit.runner.JUnitCore().run(TileTest.class);
	}
}