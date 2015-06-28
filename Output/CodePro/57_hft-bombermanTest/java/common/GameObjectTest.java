package common;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GameObjectTest</code> contains tests for the class <code>{@link GameObject}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:14 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class GameObjectTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture4;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture5;

	/**
	 * An instance of the class being tested.
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	private GameObject fixture6;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PowerUp(new Point());
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PowerUp(new Point());
			fixture2.setId(0);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PowerUp(new Point());
			fixture3.setId(1);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new PowerUp(new Point());
			fixture4.setId(7);
		}
		return fixture4;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture5()
		throws Exception {
		if (fixture5 == null) {
			fixture5 = new Tile(new Point());
		}
		return fixture5;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see GameObject
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	public GameObject getFixture6()
		throws Exception {
		if (fixture6 == null) {
			fixture6 = new Tile(new Point());
			fixture6.setId(0);
		}
		return fixture6;
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetId_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testGetPosition_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0.0, result.getY(), 1.0);
		assertEquals(0.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=0,y=0]", result.toString());
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		boolean result = fixture.isActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testIsActive_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		boolean result = fixture.isActive();

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
		GameObject fixture = getFixture1();

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
	public void testIsVisible_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

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
		GameObject fixture = getFixture3();

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
	public void testIsVisible_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

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
		GameObject fixture = getFixture5();

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
		GameObject fixture = getFixture6();

		boolean result = fixture.isVisible();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetActive_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		fixture.setActive();

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture2_2()
		throws Exception {
		GameObject fixture = getFixture2();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture3_2()
		throws Exception {
		GameObject fixture = getFixture3();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture4_2()
		throws Exception {
		GameObject fixture = getFixture4();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture5_2()
		throws Exception {
		GameObject fixture = getFixture5();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture6_2()
		throws Exception {
		GameObject fixture = getFixture6();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture1_2()
		throws Exception {
		GameObject fixture = getFixture1();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture3_3()
		throws Exception {
		GameObject fixture = getFixture3();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture4_3()
		throws Exception {
		GameObject fixture = getFixture4();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture5_3()
		throws Exception {
		GameObject fixture = getFixture5();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture6_3()
		throws Exception {
		GameObject fixture = getFixture6();
		int id = 0;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture1_3()
		throws Exception {
		GameObject fixture = getFixture1();
		int id = 1;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setId(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetId_fixture2_3()
		throws Exception {
		GameObject fixture = getFixture2();
		int id = 7;

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInactive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInactive_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		fixture.setInactive();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setInvisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetInvisible_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		fixture.setInvisible();

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_2()
		throws Exception {
		GameObject fixture = getFixture2();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture3_2()
		throws Exception {
		GameObject fixture = getFixture3();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture4_2()
		throws Exception {
		GameObject fixture = getFixture4();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture5_2()
		throws Exception {
		GameObject fixture = getFixture5();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture6_2()
		throws Exception {
		GameObject fixture = getFixture6();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_2()
		throws Exception {
		GameObject fixture = getFixture1();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture3_3()
		throws Exception {
		GameObject fixture = getFixture3();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture4_3()
		throws Exception {
		GameObject fixture = getFixture4();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture5_3()
		throws Exception {
		GameObject fixture = getFixture5();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture6_3()
		throws Exception {
		GameObject fixture = getFixture6();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_3()
		throws Exception {
		GameObject fixture = getFixture1();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_3()
		throws Exception {
		GameObject fixture = getFixture2();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture4_4()
		throws Exception {
		GameObject fixture = getFixture4();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture5_4()
		throws Exception {
		GameObject fixture = getFixture5();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture6_4()
		throws Exception {
		GameObject fixture = getFixture6();
		Point position = new Point();

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture1_4()
		throws Exception {
		GameObject fixture = getFixture1();
		Point position = new Point(0, 0);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture2_4()
		throws Exception {
		GameObject fixture = getFixture2();
		Point position = new Point(1, 1);

		fixture.setPosition(position);

		// add additional test code here
	}

	/**
	 * Run the void setPosition(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetPosition_fixture3_4()
		throws Exception {
		GameObject fixture = getFixture3();
		Point position = new Point((Point) null);

		fixture.setPosition(position);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture1_1()
		throws Exception {
		GameObject fixture = getFixture1();

		fixture.setVisible();

		// add additional test code here
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture2_1()
		throws Exception {
		GameObject fixture = getFixture2();

		fixture.setVisible();

		// add additional test code here
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture3_1()
		throws Exception {
		GameObject fixture = getFixture3();

		fixture.setVisible();

		// add additional test code here
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture4_1()
		throws Exception {
		GameObject fixture = getFixture4();

		fixture.setVisible();

		// add additional test code here
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture5_1()
		throws Exception {
		GameObject fixture = getFixture5();

		fixture.setVisible();

		// add additional test code here
	}

	/**
	 * Run the void setVisible() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:14 PM
	 */
	@Test
	public void testSetVisible_fixture6_1()
		throws Exception {
		GameObject fixture = getFixture6();

		fixture.setVisible();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(GameObjectTest.class);
	}
}