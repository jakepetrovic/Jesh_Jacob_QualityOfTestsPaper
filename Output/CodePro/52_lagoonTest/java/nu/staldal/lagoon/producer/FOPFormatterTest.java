package nu.staldal.lagoon.producer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;

/**
 * The class <code>FOPFormatterTest</code> contains tests for the class <code>{@link FOPFormatter}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FOPFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FOPFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private FOPFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FOPFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public FOPFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new FOPFormatter();
		}
		return fixture;
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_1()
		throws Exception {
		FOPFormatter fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_2()
		throws Exception {
		FOPFormatter fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_3()
		throws Exception {
		FOPFormatter fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.hasBeenUpdated(FOPFormatter.java:105)
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testInit_fixture_1()
		throws Exception {
		FOPFormatter fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: org/apache/avalon/framework/logger/Logger
		//       at nu.staldal.lagoon.producer.FOPFormatter.init(FOPFormatter.java:61)
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	@Test
	public void testStart_fixture_1()
		throws Exception {
		FOPFormatter fixture2 = getFixture();
		OutputStream out = new ByteArrayOutputStream();
		Target target = null;

		fixture2.start(out, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.FOPFormatter.start(FOPFormatter.java:79)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
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
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FOPFormatterTest.class);
	}
}