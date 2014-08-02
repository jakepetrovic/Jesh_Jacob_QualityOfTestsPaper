package com.sap.netweaver.porta.core.nw7;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FaultReasonsTest</code> contains tests for the class <code>{@link FaultReasons}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:47 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class FaultReasonsTest {
	/**
	 * Run the FaultReasons(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */

	/**
	 * Run the String getFaultReason() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetFaultReason_1()
		throws Exception {
		FaultReasons fixture = FaultReasons.FAULT_END_DEBUG_SESSION_WRONG_STATE;

		String result = fixture.getFaultReason();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FaultReasons fixture = FaultReasons.FAULT_END_DEBUG_SESSION_WRONG_STATE;

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FaultReasonsTest.class);
	}
}