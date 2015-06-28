package nu.staldal.lagoon.producer;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;

/**
 * The class <code>FileReadTest</code> contains tests for the class <code>{@link FileRead}</code>.
 *
 * @generatedBy CodePro at 6/28/15 2:38 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class FileReadTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see FileRead
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	private FileRead fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see FileRead
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	public FileRead getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new FileRead();
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
		FileRead fixture2 = getFixture();
		long when = -1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
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
		FileRead fixture2 = getFixture();
		long when = 0L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
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
		FileRead fixture2 = getFixture();
		long when = 1L;

		boolean result = fixture2.hasBeenUpdated(when);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.hasBeenUpdated(FileRead.java:75)
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/28/15 2:38 PM
	 */
	@Test
	public void testInit_fixture_1()
		throws Exception {
		FileRead fixture2 = getFixture();

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
		FileRead fixture2 = getFixture();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture2.start(bytes, target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.RuntimeException: No SourceManager avaliable
		//       at nu.staldal.lagoon.core.Producer.getSourceMan(Producer.java:171)
		//       at nu.staldal.lagoon.producer.FileRead.start(FileRead.java:57)
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
		new org.junit.runner.JUnitCore().run(FileReadTest.class);
	}
}