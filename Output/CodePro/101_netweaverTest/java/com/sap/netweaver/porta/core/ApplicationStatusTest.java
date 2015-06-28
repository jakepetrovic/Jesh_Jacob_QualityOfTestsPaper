package com.sap.netweaver.porta.core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ApplicationStatusTest</code> contains tests for the class <code>{@link ApplicationStatus}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:40 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ApplicationStatusTest {
	/**
	 * Run the ApplicationStatus(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */

	/**
	 * Run the ApplicationStatus getByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetByName_1()
		throws Exception {
		String name = "";

		ApplicationStatus result = ApplicationStatus.getByName(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ApplicationStatus getByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetByName_2()
		throws Exception {
		String name = "";

		ApplicationStatus result = ApplicationStatus.getByName(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ApplicationStatus getByName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetByName_3()
		throws Exception {
		String name = "";

		ApplicationStatus result = ApplicationStatus.getByName(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ApplicationStatus fixture = ApplicationStatus.IMPLICIT_STOPPED;

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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ApplicationStatusTest.class);
	}
}