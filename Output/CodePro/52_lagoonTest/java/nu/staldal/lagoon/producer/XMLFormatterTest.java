package nu.staldal.lagoon.producer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;

/**
 * The class <code>XMLFormatterTest</code> contains tests for the class <code>{@link XMLFormatter}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:35 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class XMLFormatterTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see XMLFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	private XMLFormatter fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see XMLFormatter
	 *
	 * @generatedBy CodePro at 6/28/15 2:35 PM
	 */
	public XMLFormatter getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new XMLFormatter();
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
		XMLFormatter fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLFormatter.hasBeenUpdated(XMLFormatter.java:195)
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
		XMLFormatter fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLFormatter.hasBeenUpdated(XMLFormatter.java:195)
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
		XMLFormatter fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.lagoon.producer.XMLFormatter.hasBeenUpdated(XMLFormatter.java:195)
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
		XMLFormatter fixture2 = getFixture();

		fixture2.init();

		// add additional test code here
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
		XMLFormatter fixture2 = getFixture();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture2.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at nu.staldal.xodus.OutputConfig.<init>(OutputConfig.java:88)
		//       at nu.staldal.xodus.OutputConfig.createOutputConfig(OutputConfig.java:81)
		//       at nu.staldal.xodus.Serializer.createSerializer(Serializer.java:113)
		//       at nu.staldal.lagoon.producer.XMLFormatter.start(XMLFormatter.java:180)
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
		new org.junit.runner.JUnitCore().run(XMLFormatterTest.class);
	}
}