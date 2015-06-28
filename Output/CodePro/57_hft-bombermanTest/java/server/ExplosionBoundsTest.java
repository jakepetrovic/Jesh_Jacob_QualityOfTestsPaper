package server;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExplosionBoundsTest</code> contains tests for the class <code>{@link ExplosionBounds}</code>.
 *
 * @generatedBy CodePro at 6/14/15 5:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class ExplosionBoundsTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ExplosionBounds fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ExplosionBounds fixture2;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ExplosionBounds fixture3;

	/**
	 * An instance of the class being tested.
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	private ExplosionBounds fixture4;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ExplosionBounds getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new ExplosionBounds(-1, -1, -1, -1);
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ExplosionBounds getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new ExplosionBounds(0, 0, 0, 0);
		}
		return fixture2;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ExplosionBounds getFixture3()
		throws Exception {
		if (fixture3 == null) {
			fixture3 = new ExplosionBounds(1, 1, 1, 1);
		}
		return fixture3;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see ExplosionBounds
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	public ExplosionBounds getFixture4()
		throws Exception {
		if (fixture4 == null) {
			fixture4 = new ExplosionBounds(7, 7, 7, 7);
		}
		return fixture4;
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_1()
		throws Exception {
		int up = 0;
		int down = 0;
		int right = 0;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(0, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_2()
		throws Exception {
		int up = 1;
		int down = 1;
		int right = 1;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_3()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 7;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_4()
		throws Exception {
		int up = 1;
		int down = 1;
		int right = 1;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_5()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 7;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_6()
		throws Exception {
		int up = 1;
		int down = 1;
		int right = 0;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_7()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 7;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_8()
		throws Exception {
		int up = 1;
		int down = 1;
		int right = 0;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_9()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 1;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_10()
		throws Exception {
		int up = 1;
		int down = 1;
		int right = 0;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_11()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 1;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_12()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 7;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_13()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 1;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_14()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 7;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_15()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 0;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_16()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 7;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_17()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 0;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_18()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 1;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_19()
		throws Exception {
		int up = 7;
		int down = 7;
		int right = 0;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_20()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 1;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_21()
		throws Exception {
		int up = 7;
		int down = 1;
		int right = 7;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_22()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 1;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_23()
		throws Exception {
		int up = 7;
		int down = 1;
		int right = 7;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_24()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 0;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_25()
		throws Exception {
		int up = 7;
		int down = 1;
		int right = 7;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_26()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 0;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_27()
		throws Exception {
		int up = 7;
		int down = 1;
		int right = 1;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_28()
		throws Exception {
		int up = 1;
		int down = 0;
		int right = 0;
		int left = 0;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getLeft());
		assertEquals(0, result.getRight());
		assertEquals(1, result.getUp());
		assertEquals(0, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_29()
		throws Exception {
		int up = 7;
		int down = 1;
		int right = 1;
		int left = 1;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getLeft());
		assertEquals(1, result.getRight());
		assertEquals(7, result.getUp());
		assertEquals(1, result.getDown());
	}

	/**
	 * Run the ExplosionBounds(int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testExplosionBounds_30()
		throws Exception {
		int up = 0;
		int down = 7;
		int right = 7;
		int left = 7;

		ExplosionBounds result = new ExplosionBounds(up, down, right, left);

		// add additional test code here
		assertNotNull(result);
		assertEquals(7, result.getLeft());
		assertEquals(7, result.getRight());
		assertEquals(0, result.getUp());
		assertEquals(7, result.getDown());
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture1_1()
		throws Exception {
		ExplosionBounds fixture = getFixture1();
		Point p = new Point();

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture2_1()
		throws Exception {
		ExplosionBounds fixture = getFixture2();
		Point p = new Point(0, 0);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture3_1()
		throws Exception {
		ExplosionBounds fixture = getFixture3();
		Point p = new Point(1, 1);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture4_1()
		throws Exception {
		ExplosionBounds fixture = getFixture4();
		Point p = new Point((Point) null);

		boolean result = fixture.contain(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture2_2()
		throws Exception {
		ExplosionBounds fixture = getFixture2();
		Point p = new Point();

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture3_2()
		throws Exception {
		ExplosionBounds fixture = getFixture3();
		Point p = new Point(0, 0);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture4_2()
		throws Exception {
		ExplosionBounds fixture = getFixture4();
		Point p = new Point(1, 1);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture1_2()
		throws Exception {
		ExplosionBounds fixture = getFixture1();
		Point p = new Point((Point) null);

		boolean result = fixture.contain(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture3_3()
		throws Exception {
		ExplosionBounds fixture = getFixture3();
		Point p = new Point();

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture4_3()
		throws Exception {
		ExplosionBounds fixture = getFixture4();
		Point p = new Point(0, 0);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture1_3()
		throws Exception {
		ExplosionBounds fixture = getFixture1();
		Point p = new Point(1, 1);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture2_3()
		throws Exception {
		ExplosionBounds fixture = getFixture2();
		Point p = new Point((Point) null);

		boolean result = fixture.contain(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture4_4()
		throws Exception {
		ExplosionBounds fixture = getFixture4();
		Point p = new Point();

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture1_4()
		throws Exception {
		ExplosionBounds fixture = getFixture1();
		Point p = new Point(0, 0);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture2_4()
		throws Exception {
		ExplosionBounds fixture = getFixture2();
		Point p = new Point(1, 1);

		boolean result = fixture.contain(p);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contain(Point) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testContain_fixture3_4()
		throws Exception {
		ExplosionBounds fixture = getFixture3();
		Point p = new Point((Point) null);

		boolean result = fixture.contain(p);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at java.awt.Point.<init>(Point.java:82)
		assertTrue(result);
	}

	/**
	 * Run the int getDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetDown_fixture1_1()
		throws Exception {
		ExplosionBounds fixture = getFixture1();

		int result = fixture.getDown();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetDown_fixture2_1()
		throws Exception {
		ExplosionBounds fixture = getFixture2();

		int result = fixture.getDown();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetDown_fixture3_1()
		throws Exception {
		ExplosionBounds fixture = getFixture3();

		int result = fixture.getDown();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetDown_fixture4_1()
		throws Exception {
		ExplosionBounds fixture = getFixture4();

		int result = fixture.getDown();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetLeft_fixture1_1()
		throws Exception {
		ExplosionBounds fixture = getFixture1();

		int result = fixture.getLeft();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetLeft_fixture2_1()
		throws Exception {
		ExplosionBounds fixture = getFixture2();

		int result = fixture.getLeft();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetLeft_fixture3_1()
		throws Exception {
		ExplosionBounds fixture = getFixture3();

		int result = fixture.getLeft();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLeft() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetLeft_fixture4_1()
		throws Exception {
		ExplosionBounds fixture = getFixture4();

		int result = fixture.getLeft();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetRight_fixture1_1()
		throws Exception {
		ExplosionBounds fixture = getFixture1();

		int result = fixture.getRight();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetRight_fixture2_1()
		throws Exception {
		ExplosionBounds fixture = getFixture2();

		int result = fixture.getRight();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetRight_fixture3_1()
		throws Exception {
		ExplosionBounds fixture = getFixture3();

		int result = fixture.getRight();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getRight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetRight_fixture4_1()
		throws Exception {
		ExplosionBounds fixture = getFixture4();

		int result = fixture.getRight();

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int getUp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetUp_fixture1_1()
		throws Exception {
		ExplosionBounds fixture = getFixture1();

		int result = fixture.getUp();

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int getUp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetUp_fixture2_1()
		throws Exception {
		ExplosionBounds fixture = getFixture2();

		int result = fixture.getUp();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getUp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetUp_fixture3_1()
		throws Exception {
		ExplosionBounds fixture = getFixture3();

		int result = fixture.getUp();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getUp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/14/15 5:15 PM
	 */
	@Test
	public void testGetUp_fixture4_1()
		throws Exception {
		ExplosionBounds fixture = getFixture4();

		int result = fixture.getUp();

		// add additional test code here
		assertEquals(7, result);
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
		new org.junit.runner.JUnitCore().run(ExplosionBoundsTest.class);
	}
}