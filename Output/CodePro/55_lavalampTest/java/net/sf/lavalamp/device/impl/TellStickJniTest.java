package net.sf.lavalamp.device.impl;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TellStickJniTest</code> contains tests for the class <code>{@link TellStickJni}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class TellStickJniTest {
	/**
	 * Run the TellStickJni() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at net.sf.lavalamp.device.impl.TellStickJni.init(TellStickJni.java:31)
	}

	/**
	 * Run the void setLibrary(TellStickLibrary) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOff_1()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOff();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Integer.java:454)
		//       at java.lang.Integer.<init>(Integer.java:677)
		//       at net.sf.lavalamp.device.impl.TellStickJni.turnOff(TellStickJni.java:24)
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOff_2()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOff();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Integer.java:454)
		//       at java.lang.Integer.<init>(Integer.java:677)
		//       at net.sf.lavalamp.device.impl.TellStickJni.turnOff(TellStickJni.java:24)
	}

	/**
	 * Run the void turnOff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOn_1()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Integer.java:454)
		//       at java.lang.Integer.<init>(Integer.java:677)
		//       at net.sf.lavalamp.device.impl.TellStickJni.turnOn(TellStickJni.java:38)
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testTurnOn_2()
		throws Exception {
		TellStickJni fixture = new TellStickJni();
		fixture.setLibrary((TellStickLibrary) null);

		fixture.turnOn();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NumberFormatException: null
		//       at java.lang.Integer.parseInt(Integer.java:454)
		//       at java.lang.Integer.<init>(Integer.java:677)
		//       at net.sf.lavalamp.device.impl.TellStickJni.turnOn(TellStickJni.java:38)
	}

	/**
	 * Run the void turnOn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test(expected = java.lang.NumberFormatException.class)
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TellStickJniTest.class);
	}
}