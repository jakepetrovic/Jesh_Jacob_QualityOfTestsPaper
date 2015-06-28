package com.sap.netweaver.porta.ide.eclipse.server.runtime;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNW710RuntimeTest</code> contains tests for the class <code>{@link SapNW710Runtime}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNW710RuntimeTest {
	/**
	 * Run the SapNW710Runtime() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSapNW710Runtime_1()
		throws Exception {
		SapNW710Runtime result = new SapNW710Runtime();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String[] getJ2EE14Classpath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetJ2EE14Classpath_1()
		throws Exception {
		SapNW710Runtime fixture = new SapNW710Runtime();

		String[] result = fixture.getJ2EE14Classpath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getJavaEE5Classpath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetJavaEE5Classpath_1()
		throws Exception {
		SapNW710Runtime fixture = new SapNW710Runtime();

		String[] result = fixture.getJavaEE5Classpath();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNW710RuntimeTest.class);
	}
}