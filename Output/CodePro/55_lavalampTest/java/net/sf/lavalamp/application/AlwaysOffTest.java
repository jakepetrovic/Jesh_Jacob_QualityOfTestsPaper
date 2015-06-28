package net.sf.lavalamp.application;

import org.junit.*;
import net.sf.lavalamp.Pause;
import static org.junit.Assert.*;

/**
 * The class <code>AlwaysOffTest</code> contains tests for the class <code>{@link AlwaysOff}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AlwaysOffTest {
	/**
	 * Run the AlwaysOff(WebRun,Pause) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testAlwaysOff_1()
		throws Exception {
		WebRun webRun = new WebRun();
		Pause pause = new Pause();

		AlwaysOff result = new AlwaysOff(webRun, pause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Thread[Thread-586,1,main]", result.toString());
		assertEquals(false, result.isInterrupted());
		assertEquals("Thread-586", result.getName());
		assertEquals(false, result.isAlive());
		assertEquals(1, result.getPriority());
		assertEquals(0, result.countStackFrames());
		assertEquals(true, result.isDaemon());
		assertEquals(640L, result.getId());
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		AlwaysOff fixture = new AlwaysOff(new WebRun(), new Pause());

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testRun_2()
		throws Exception {
		AlwaysOff fixture = new AlwaysOff(new WebRun(), new Pause());

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testRun_3()
		throws Exception {
		AlwaysOff fixture = new AlwaysOff(new WebRun(), new Pause());

		fixture.run();

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AlwaysOffTest.class);
	}
}