package nu.staldal.lagoon.producer;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import nu.staldal.lagoon.core.LagoonException;
import java.io.OutputStream;
import org.junit.*;
import nu.staldal.lagoon.core.Target;
import static org.junit.Assert.*;

/**
 * The class <code>FileReadTest</code> contains tests for the class <code>{@link FileRead}</code>.
 *
 * @generatedBy CodePro at 4/23/14 7:56 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FileReadTest {
	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testHasBeenUpdated_1()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testHasBeenUpdated_2()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testHasBeenUpdated_3()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testHasBeenUpdated_4()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testHasBeenUpdated_5()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testHasBeenUpdated_6()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasBeenUpdated(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = nu.staldal.lagoon.core.LagoonException.class)
	public void testHasBeenUpdated_7()
		throws Exception {
		FileRead fixture = new FileRead();
		long when = 1L;

		boolean result = fixture.hasBeenUpdated(when);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		FileRead fixture = new FileRead();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_2()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test
	public void testStart_3()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_4()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_5()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_6()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.IOException.class)
	public void testStart_7()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testStart_8()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Run the void start(OutputStream,Target) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testStart_9()
		throws Exception {
		FileRead fixture = new FileRead();
		OutputStream bytes = new ByteArrayOutputStream();
		Target target = null;

		fixture.start(bytes, target);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
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
	 * @generatedBy CodePro at 4/23/14 7:56 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FileReadTest.class);
	}
}