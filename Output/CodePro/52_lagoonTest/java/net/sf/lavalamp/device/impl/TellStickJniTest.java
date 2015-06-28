package net.sf.lavalamp.device.impl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TellStickJniTest</code> contains tests for the class <code>{@link TellStickJni}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:33 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TellStickJniTest {
	/**
	 * Run the TellStickJni() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testTellStickJni_1()
		throws Exception {
		TellStickJni result = new TellStickJni();
		assertNotNull(result);
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
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void setLibrary(TellStickLibrary) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test
	public void testSetLibrary_1()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);
		TellStickLibrary library = null;

		fixture.setLibrary(library);

		// add additional test code here
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
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOff();

		// add additional test code here
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testTurnOff_2()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOff();

		// add additional test code here
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testTurnOff_3()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

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
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOn();

		// add additional test code here
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
	public void testTurnOn_2()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOn();

		// add additional test code here
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:33 AM
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testTurnOn_3()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

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
		new org.junit.runner.JUnitCore().run(TellStickJniTest.class);
	}
}