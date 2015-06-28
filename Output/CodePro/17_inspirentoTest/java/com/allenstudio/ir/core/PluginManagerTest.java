package com.allenstudio.ir.core;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PluginManagerTest</code> contains tests for the class <code>{@link PluginManager}</code>.
 *
 * @generatedBy CodePro at 4/8/14 12:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PluginManagerTest {
	/**
	 * Run the String[] getAllPluginNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetAllPluginNames_1()
		throws Exception {
		PluginManager fixture = PluginManager.getInstance();

		String[] result = fixture.getAllPluginNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getAllPluginNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetAllPluginNames_2()
		throws Exception {
		PluginManager fixture = PluginManager.getInstance();

		String[] result = fixture.getAllPluginNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PluginManager getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		PluginManager result = PluginManager.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PluginManager getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		PluginManager result = PluginManager.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPlugins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetPlugins_1()
		throws Exception {
		PluginManager fixture = PluginManager.getInstance();

		String[] result = fixture.getPlugins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getPlugins() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testGetPlugins_2()
		throws Exception {
		PluginManager fixture = PluginManager.getInstance();

		String[] result = fixture.getPlugins();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 12:31 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PluginManager.main(args);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(PluginManagerTest.class);
	}
}