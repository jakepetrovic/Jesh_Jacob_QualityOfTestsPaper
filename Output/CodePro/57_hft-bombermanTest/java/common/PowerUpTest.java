package common;

import java.awt.Point;
import java.awt.Rectangle;
import client.ClientBomb;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PowerUpTest</code> contains tests for the class <code>{@link PowerUp}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PowerUpTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PowerUp
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	private PowerUp fixture;

	/**
	 * Initialize a newly create test instance to have the given name.
	 *
	 * @param name the name of the test
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public PowerUpTest(String name) {
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PowerUp
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public PowerUp getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new PowerUp(new Point());
		}
		return fixture;
	}

	/**
	 * Run the PowerUp(Point) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testPowerUp_1()
		throws Exception {
		Point position = new Point();

		PowerUp result = new PowerUp(position);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
		assertEquals(true, result.isAccessable());
		assertEquals(0, result.getId());
		assertEquals(true, result.isActive());
		assertEquals(false, result.isVisible());
		assertEquals(0, result.countObservers());
		assertEquals(false, result.hasChanged());
	}

	/**
	 * Run the boolean collide(GameObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testCollide_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();
		GameObject gameobject = new ClientBomb(new Point(), (GameObject) null);

		boolean result = fixture2.collide(gameobject);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.apache.log4j.Logger.getLogger(Logger.java:116)
		//       at common.Actor.<clinit>(Actor.java:16)
		assertTrue(result);
	}

	/**
	 * Run the void die() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testDie_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		fixture2.die();

		// add additional test code here
	}

	/**
	 * Run the Rectangle getCollisionRectangle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetCollisionRectangle_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		Rectangle result = fixture2.getCollisionRectangle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(-19.0, result.getY(), 1.0);
		assertEquals(-19.0, result.getX(), 1.0);
		assertEquals("java.awt.Rectangle[x=-19,y=-19,width=38,height=38]", result.toString());
		assertEquals(false, result.isEmpty());
		assertEquals(38.0, result.getHeight(), 1.0);
		assertEquals(38.0, result.getWidth(), 1.0);
		assertEquals(19.0, result.getMaxX(), 1.0);
		assertEquals(19.0, result.getMaxY(), 1.0);
		assertEquals(0.0, result.getCenterX(), 1.0);
		assertEquals(0.0, result.getCenterY(), 1.0);
		assertEquals(-19.0, result.getMinX(), 1.0);
		assertEquals(-19.0, result.getMinY(), 1.0);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetType_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		String result = fixture2.getType();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getTypeInt() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testGetTypeInt_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		int result = fixture2.getTypeInt();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at common.PowerUp.getTypeInt(PowerUp.java:94)
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isAccessable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testIsAccessable_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		boolean result = fixture2.isAccessable();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testSetType_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();
		String type = "bowl";

		fixture2.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testUpdate_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();

		fixture2.update();

		// add additional test code here
	}

	/**
	 * Run the void updateWithCollisionCheck(Collection<GameObject>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	@Test
	public void testUpdateWithCollisionCheck_fixture_1()
		throws Exception {
		PowerUp fixture2 = getFixture();
		ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
		gameObjects.add(new ClientBomb(new Point(), (GameObject) null));

		fixture2.updateWithCollisionCheck(gameObjects);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class client.ClientBomb
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 6/14/15 5:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PowerUpTest.class);
	}
}