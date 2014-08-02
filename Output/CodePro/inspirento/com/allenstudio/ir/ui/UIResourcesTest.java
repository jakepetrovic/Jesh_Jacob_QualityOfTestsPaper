package com.allenstudio.ir.ui;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>UIResourcesTest</code> contains tests for the class <code>{@link UIResources}</code>.
 *
 * @generatedBy CodePro at 4/8/14 12:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class UIResourcesTest {
	/**
	 * Run the UIResources() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testUIResources_1()
		throws Exception {
		UIResources result = new UIResources();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		String key = "";

		String result = UIResources.getString(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
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
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UIResourcesTest.class);
	}
}