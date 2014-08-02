package com.sap.netweaver.porta.mon;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExitCommandTest</code> contains tests for the class <code>{@link ExitCommand}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:46 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ExitCommandTest {
	/**
	 * Run the String execute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		ExitCommand fixture = new ExitCommand();

		String result = fixture.execute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExitCommandTest.class);
	}
}