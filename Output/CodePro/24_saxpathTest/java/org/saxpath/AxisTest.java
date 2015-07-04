package org.saxpath;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AxisTest</code> contains tests for the class <code>{@link Axis}</code>.
 *
 * @generatedBy CodePro at 7/4/15 1:00 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AxisTest {
	/**
	 * Run the Axis() constructor test.
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testAxis_1()
		throws Exception {
		Axis result = new Axis();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_1()
		throws Exception {
		int axisNum = 1;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("child", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_2()
		throws Exception {
		int axisNum = 10;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("namespace", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_3()
		throws Exception {
		int axisNum = 11;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("self", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_4()
		throws Exception {
		int axisNum = 12;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("descendant-or-self", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_5()
		throws Exception {
		int axisNum = 13;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("ancestor-or-self", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_6()
		throws Exception {
		int axisNum = 2;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("descendant", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_7()
		throws Exception {
		int axisNum = 3;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("parent", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_8()
		throws Exception {
		int axisNum = 4;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("ancestor", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_9()
		throws Exception {
		int axisNum = 5;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("following-sibling", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_10()
		throws Exception {
		int axisNum = 6;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("preceding-sibling", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_11()
		throws Exception {
		int axisNum = 7;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("following", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_12()
		throws Exception {
		int axisNum = 8;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("preceding", result);
	}

	/**
	 * Run the String lookup(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_13()
		throws Exception {
		int axisNum = 9;

		String result = Axis.lookup(axisNum);

		// add additional test code here
		assertEquals("attribute", result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_14()
		throws Exception {
		String axisName = "ancestor";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_15()
		throws Exception {
		String axisName = "ancestor-or-self";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(13, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_16()
		throws Exception {
		String axisName = "attribute";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(9, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_17()
		throws Exception {
		String axisName = "child";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_18()
		throws Exception {
		String axisName = "descendant";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_19()
		throws Exception {
		String axisName = "descendant-or-self";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(12, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_20()
		throws Exception {
		String axisName = "following";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(7, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_21()
		throws Exception {
		String axisName = "following-sibling";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_22()
		throws Exception {
		String axisName = "namespace";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(10, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_23()
		throws Exception {
		String axisName = "parent";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_24()
		throws Exception {
		String axisName = "preceding";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(8, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_25()
		throws Exception {
		String axisName = "preceding-sibling";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(6, result);
	}

	/**
	 * Run the int lookup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	@Test
	public void testLookup_26()
		throws Exception {
		String axisName = "self";

		int result = Axis.lookup(axisName);

		// add additional test code here
		assertEquals(11, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
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
	 * @generatedBy CodePro at 7/4/15 1:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AxisTest.class);
	}
}