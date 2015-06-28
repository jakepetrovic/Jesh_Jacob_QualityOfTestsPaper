package nu.staldal.lagoon.producer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import nu.staldal.lagoon.core.LagoonException;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;

/**
 * The class <code>BatikFormatterTest</code> contains tests for the class <code>{@link BatikFormatter}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BatikFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see BatikFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private BatikFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see BatikFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public BatikFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new BatikFormatter();
		}
		return fixture;
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_1()
		throws Exception {
		BatikFormatter fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BatikFormatter.hasBeenUpdated(BatikFormatter.java:163)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_2()
		throws Exception {
		BatikFormatter fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BatikFormatter.hasBeenUpdated(BatikFormatter.java:163)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testHasBeenUpdated_fixture_3()
		throws Exception {
		BatikFormatter fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.BatikFormatter.hasBeenUpdated(BatikFormatter.java:163)
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testInit_fixture_1()
		throws Exception {
		BatikFormatter fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testStart_fixture_1()
		throws Exception {
		BatikFormatter fixture2 = getFixture();
		OutputStream out = new ByteArrayOutputStream();
		Target target = null;

		fixture2.start(out, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.BatikFormatter.start(BatikFormatter.java:103)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
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
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BatikFormatterTest.class);
	}
}