package com.sap.netweaver.porta.ide.eclipse.util;

import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleType;
import org.eclipse.wst.server.core.internal.DeletedModule;
import org.eclipse.wst.server.core.internal.ModuleType;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWServerUtilTest</code> contains tests for the class <code>{@link SapNWServerUtil}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:39 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWServerUtilTest {
	/**
	 * Run the boolean areAllDeployableModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testAreAllDeployableModules_1()
		throws Exception {
		IModule[] modules = new IModule[] {};

		boolean result = SapNWServerUtil.areAllDeployableModules(modules);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean areAllDeployableModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testAreAllDeployableModules_2()
		throws Exception {
		IModule[] modules = new IModule[] {};

		boolean result = SapNWServerUtil.areAllDeployableModules(modules);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean areAllDeployableModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testAreAllDeployableModules_3()
		throws Exception {
		IModule[] modules = new IModule[] {};

		boolean result = SapNWServerUtil.areAllDeployableModules(modules);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isDeployableModule(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsDeployableModule_1()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isDeployableModule(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isDeployableModule(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsDeployableModule_2()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isDeployableModule(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isDeployableModule(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsDeployableModule_3()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isDeployableModule(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsEAR_1()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isEAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsEAR_2()
		throws Exception {
		IModule module = null;

		boolean result = SapNWServerUtil.isEAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isEAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsEAR_3()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isEAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isWAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsWAR_1()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isWAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isWAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsWAR_2()
		throws Exception {
		IModule module = null;

		boolean result = SapNWServerUtil.isWAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isWAR(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testIsWAR_3()
		throws Exception {
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		boolean result = SapNWServerUtil.isWAR(module);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWServerUtilTest.class);
	}
}