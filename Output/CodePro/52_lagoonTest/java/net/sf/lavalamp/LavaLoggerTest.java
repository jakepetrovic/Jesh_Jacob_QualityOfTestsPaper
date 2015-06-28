package net.sf.lavalamp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LavaLoggerTest</code> contains tests for the class <code>{@link LavaLogger}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:33 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LavaLoggerTest {
	/**
	 * Run the LavaLogger() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testLavaLogger_1()
		throws Exception {
		LavaLogger result = new LavaLogger();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void debug(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testDebug_1()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		String message = "";

		fixture.debug(message);

		// add additional test code here
	}

	/**
	 * Run the void debug(Calendar,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testDebug_2()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		String message = "";

		fixture.debug(calendar, message);

		// add additional test code here
	}

	/**
	 * Run the void debug(Calendar,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testDebug_3()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		String message = "";

		fixture.debug(calendar, message);

		// add additional test code here
	}

	/**
	 * Run the void error(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testError_1()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		String message = "";

		fixture.error(message);

		// add additional test code here
	}

	/**
	 * Run the void error(Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testError_2()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Throwable e = new Throwable();

		fixture.error(e);

		// add additional test code here
	}

	/**
	 * Run the void error(Calendar,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testError_3()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		String message = "";

		fixture.error(calendar, message);

		// add additional test code here
	}

	/**
	 * Run the void error(Calendar,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testError_4()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		Throwable e = new Throwable();

		fixture.error(calendar, e);

		// add additional test code here
	}

	/**
	 * Run the void error(Calendar,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testError_5()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		Throwable e = new Throwable();

		fixture.error(calendar, e);

		// add additional test code here
	}

	/**
	 * Run the void info(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testInfo_1()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		String message = "";

		fixture.info(message);

		// add additional test code here
	}

	/**
	 * Run the void info(Calendar,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testInfo_2()
		throws Exception {
		LavaLogger fixture = new LavaLogger();
		Calendar calendar = new GregorianCalendar();
		String message = "";

		fixture.info(calendar, message);

		// add additional test code here
	}

	/**
	 * Run the void setDebug(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testSetDebug_1()
		throws Exception {
		boolean debug = true;

		LavaLogger.setDebug(debug);

		// add additional test code here
	}

	/**
	 * Run the void setErr(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testSetErr_1()
		throws Exception {
		PrintStream err = new PrintStream(new ByteArrayOutputStream());

		LavaLogger.setErr(err);

		// add additional test code here
	}

	/**
	 * Run the void setOut(PrintStream) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testSetOut_1()
		throws Exception {
		PrintStream out = new PrintStream(new ByteArrayOutputStream());

		LavaLogger.setOut(out);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
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
	 * @generatedBy CodePro at 4/8/14 10:33 AM
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
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LavaLoggerTest.class);
	}
}