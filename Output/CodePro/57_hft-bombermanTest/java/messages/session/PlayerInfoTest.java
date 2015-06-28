package messages.session;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PlayerInfoTest</code> contains tests for the class <code>{@link PlayerInfo}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PlayerInfoTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PlayerInfo fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PlayerInfo fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private PlayerInfo fixture3;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PlayerInfo getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new PlayerInfo(0, new Point(), "");
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PlayerInfo getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new PlayerInfo(1, new Point(0, 0), "0123456789");
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PlayerInfo
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public PlayerInfo getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new PlayerInfo(7, new Point(1, 1), "An��t-1.0.txt");
		}
		return fixture3;
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_1()
		throws Exception {
		int id = 0;
		Point position = new Point();
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_2()
		throws Exception {
		int id = 1;
		Point position = new Point(0, 0);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_3()
		throws Exception {
		int id = 7;
		Point position = new Point(1, 1);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_4()
		throws Exception {
		int id = 0;
		Point position = new Point((Point) null);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_5()
		throws Exception {
		int id = 7;
		Point position = new Point(0, 0);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_6()
		throws Exception {
		int id = 0;
		Point position = new Point(1, 1);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_7()
		throws Exception {
		int id = 1;
		Point position = new Point((Point) null);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_8()
		throws Exception {
		int id = 0;
		Point position = new Point();
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_9()
		throws Exception {
		int id = 1;
		Point position = new Point(1, 1);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_10()
		throws Exception {
		int id = 7;
		Point position = new Point((Point) null);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_11()
		throws Exception {
		int id = 1;
		Point position = new Point();
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_12()
		throws Exception {
		int id = 7;
		Point position = new Point(0, 0);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_13()
		throws Exception {
		int id = 0;
		Point position = new Point(1, 1);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_14()
		throws Exception {
		int id = 7;
		Point position = new Point();
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_15()
		throws Exception {
		int id = 0;
		Point position = new Point(0, 0);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_16()
		throws Exception {
		int id = 1;
		Point position = new Point(1, 1);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_17()
		throws Exception {
		int id = 0;
		Point position = new Point(0, 0);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(0, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_18()
		throws Exception {
		int id = 1;
		Point position = new Point((Point) null);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_19()
		throws Exception {
		int id = 0;
		Point position = new Point((Point) null);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_20()
		throws Exception {
		int id = 7;
		Point position = new Point();
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("0123456789", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_21()
		throws Exception {
		int id = 1;
		Point position = new Point();
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_22()
		throws Exception {
		int id = 7;
		Point position = new Point(1, 1);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(7, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_23()
		throws Exception {
		int id = 1;
		Point position = new Point(0, 0);
		String name = "";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getName());
		assertEquals(1, result.getId());
	}

	/**
	 * Run the PlayerInfo(int,Point,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testPlayerInfo_24()
		throws Exception {
		int id = 7;
		Point position = new Point((Point) null);
		String name = "0123456789";

		PlayerInfo result = new PlayerInfo(id, position, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertNotNull(result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetId_fixture1_1()
		throws Exception {
		PlayerInfo fixture = getFixture1();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetId_fixture2_1()
		throws Exception {
		PlayerInfo fixture = getFixture2();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetId_fixture3_1()
		throws Exception {
		PlayerInfo fixture = getFixture3();

		int result = fixture.getId();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetName_fixture1_1()
		throws Exception {
		PlayerInfo fixture = getFixture1();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetName_fixture2_1()
		throws Exception {
		PlayerInfo fixture = getFixture2();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("0123456789", result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetName_fixture3_1()
		throws Exception {
		PlayerInfo fixture = getFixture3();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("An��t-1.0.txt", result);
	}

	/**
	 * Run the Point getPosition() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPosition_fixture1_1()
		throws Exception {
		PlayerInfo fixture = getFixture1();

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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPosition_fixture2_1()
		throws Exception {
		PlayerInfo fixture = getFixture2();

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
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetPosition_fixture3_1()
		throws Exception {
		PlayerInfo fixture = getFixture3();

		Point result = fixture.getPosition();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1.0, result.getY(), 1.0);
		assertEquals(1.0, result.getX(), 1.0);
		assertEquals("java.awt.Point[x=1,y=1]", result.toString());
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
		new org.junit.runner.JUnitCore().run(PlayerInfoTest.class);
	}
}