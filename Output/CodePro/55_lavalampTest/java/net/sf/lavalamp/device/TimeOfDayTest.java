package net.sf.lavalamp.device;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TimeOfDayTest</code> contains tests for the class <code>{@link TimeOfDay}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TimeOfDayTest {
	/**
	 * Run the TimeOfDay(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTimeOfDay_1()
		throws Exception {
		String time = "";

		TimeOfDay result = new TimeOfDay(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.substring(String.java:1907)
		//       at net.sf.lavalamp.device.TimeOfDay.<init>(TimeOfDay.java:13)
		assertNotNull(result);
	}

	/**
	 * Run the TimeOfDay(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTimeOfDay_2()
		throws Exception {
		String time = "";

		TimeOfDay result = new TimeOfDay(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.substring(String.java:1907)
		//       at net.sf.lavalamp.device.TimeOfDay.<init>(TimeOfDay.java:13)
		assertNotNull(result);
	}

	/**
	 * Run the TimeOfDay(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTimeOfDay_3()
		throws Exception {
		String time = "";

		TimeOfDay result = new TimeOfDay(time);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 2
		//       at java.lang.String.substring(String.java:1907)
		//       at net.sf.lavalamp.device.TimeOfDay.<init>(TimeOfDay.java:13)
		assertNotNull(result);
	}

	/**
	 * Run the TimeOfDay(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testTimeOfDay_4()
		throws Exception {
		int hours = 1;
		int minutes = 1;

		TimeOfDay result = new TimeOfDay(hours, minutes);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(1), result.getHours());
		assertEquals(new Integer(1), result.getMinutes());
		assertEquals("1:1", result.toString());
	}

	/**
	 * Run the int compareTo(TimeOfDay) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testCompareTo_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		TimeOfDay that = new TimeOfDay(1, 1);

		int result = fixture.compareTo(that);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(TimeOfDay) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testCompareTo_2()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		TimeOfDay that = new TimeOfDay(1, 1);

		int result = fixture.compareTo(that);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = new TimeOfDay(1, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = new TimeOfDay(1, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = new TimeOfDay(1, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);
		Object obj = new TimeOfDay(1, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Integer getHours() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetHours_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);

		Integer result = fixture.getHours();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Integer getMinutes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetMinutes_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);

		Integer result = fixture.getMinutes();

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(101, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TimeOfDay fixture = new TimeOfDay(1, 1);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("1:1", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TimeOfDayTest.class);
	}
}