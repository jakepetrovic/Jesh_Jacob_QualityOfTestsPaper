package net.sf.lavalamp.application;

import java.io.FileNotFoundException;
import net.sf.lavalamp.site.Console;
import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import static org.junit.Assert.*;

/**
 * The class <code>UniversalRunnerTest</code> contains tests for the class <code>{@link UniversalRunner}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class UniversalRunnerTest {
	/**
	 * Run the UniversalRunner() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testUniversalRunner_1()
		throws Exception {
		UniversalRunner result = new UniversalRunner();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		UniversalRunner.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		UniversalRunner.main(args);

		// add additional test code here
	}

	/**
	 * Run the void run(String[],Application,Console,LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		UniversalRunner fixture = new UniversalRunner();
		String[] args = new String[] {};
		Application application = new WebRun();
		Console console = new Console();
		LavaLogger logger = new LavaLogger();

		fixture.run(args, application, console, logger);

		// add additional test code here
	}

	/**
	 * Run the void run(String[],Application,Console,LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		UniversalRunner fixture = new UniversalRunner();
		String[] args = new String[] {""};
		Application application = new WebRun();
		Console console = new Console();
		LavaLogger logger = new LavaLogger();

		fixture.run(args, application, console, logger);

		// add additional test code here
	}

	/**
	 * Run the void run(String[],Application,Console,LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRun_3()
		throws Exception {
		UniversalRunner fixture = new UniversalRunner();
		String[] args = new String[] {""};
		Application application = new WebRun();
		Console console = new Console();
		LavaLogger logger = new LavaLogger();

		fixture.run(args, application, console, logger);

		// add additional test code here
	}

	/**
	 * Run the void run(String[],Application,Console,LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testRun_4()
		throws Exception {
		UniversalRunner fixture = new UniversalRunner();
		String[] args = new String[] {""};
		Application application = new WebRun();
		Console console = new Console();
		LavaLogger logger = new LavaLogger();

		fixture.run(args, application, console, logger);

		// add additional test code here
	}

	/**
	 * Run the void run(String[],Application,Console,LavaLogger) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.FileNotFoundException.class)
	public void testRun_5()
		throws Exception {
		UniversalRunner fixture = new UniversalRunner();
		String[] args = new String[] {""};
		Application application = new WebRun();
		Console console = new Console();
		LavaLogger logger = new LavaLogger();

		fixture.run(args, application, console, logger);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UniversalRunnerTest.class);
	}
}