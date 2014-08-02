package net.sf.lavalamp.device.impl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TellStickTest</code> contains tests for the class <code>{@link TellStick}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:33 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TellStickTest {
	/**
	 * Run the TellStick() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testTellStick_1()
		throws Exception {
		TellStick result = new TellStick();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void exec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testExec_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());
		String command = "";

		fixture.exec(command);

		// add additional test code here
	}

	/**
	 * Run the void exec(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testExec_2()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());
		String command = "";

		fixture.exec(command);

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the String offString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testOffString_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		String result = fixture.offString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String onString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testOnString_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		String result = fixture.onString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setRuntime(Runtime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testSetRuntime_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());
		Runtime runtime = Runtime.getRuntime();

		fixture.setRuntime(runtime);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testTurnOff_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		fixture.turnOff();

		// add additional test code here
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testTurnOn_1()
		throws Exception {
		TellStick fixture = new TellStick();
		fixture.setRuntime(Runtime.getRuntime());

		fixture.turnOn();

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
		new org.junit.runner.JUnitCore().run(TellStickTest.class);
	}
}