package net.sf.lavalamp.device;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PeriodTest</code> contains tests for the class <code>{@link Period}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PeriodTest {
	/**
	 * Run the Period(TimeOfDay,TimeOfDay) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testPeriod_1()
		throws Exception {
		TimeOfDay startTime = new TimeOfDay(1, 1);
		TimeOfDay endTime = new TimeOfDay(1, 1);

		Period result = new Period(startTime, endTime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInPeriod(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsInPeriod_1()
		throws Exception {
		Period fixture = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		GregorianCalendar now = new GregorianCalendar();
		now.set(Calendar.MINUTE, 1);
		now.set(Calendar.HOUR_OF_DAY, 1);

		boolean result = fixture.isInPeriod(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInPeriod(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsInPeriod_2()
		throws Exception {
		Period fixture = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		GregorianCalendar now = new GregorianCalendar();
		now.set(Calendar.MINUTE, 1);
		now.set(Calendar.HOUR_OF_DAY, 1);

		boolean result = fixture.isInPeriod(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInPeriod(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsInPeriod_3()
		throws Exception {
		Period fixture = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		GregorianCalendar now = new GregorianCalendar();
		now.set(Calendar.MINUTE, 1);
		now.set(Calendar.HOUR_OF_DAY, 1);

		boolean result = fixture.isInPeriod(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInPeriod(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsInPeriod_4()
		throws Exception {
		Period fixture = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		GregorianCalendar now = new GregorianCalendar();
		now.set(Calendar.MINUTE, 1);
		now.set(Calendar.HOUR_OF_DAY, 1);

		boolean result = fixture.isInPeriod(now);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInPeriod(Calendar) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsInPeriod_5()
		throws Exception {
		Period fixture = new Period(new TimeOfDay(1, 1), new TimeOfDay(1, 1));
		GregorianCalendar now = new GregorianCalendar();
		now.set(Calendar.MINUTE, 1);
		now.set(Calendar.HOUR_OF_DAY, 1);

		boolean result = fixture.isInPeriod(now);

		// add additional test code here
		assertEquals(false, result);
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
		new org.junit.runner.JUnitCore().run(PeriodTest.class);
	}
}