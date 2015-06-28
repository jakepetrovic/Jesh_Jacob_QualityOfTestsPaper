package com.sap.netweaver.porta.ide.eclipse.server.runtime;

import java.io.File;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWRuntimeTest</code> contains tests for the class <code>{@link SapNWRuntime}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:09 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWRuntimeTest {
	/**
	 * Run the boolean doesCacheJars() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testDoesCacheJars_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		boolean result = fixture.doesCacheJars();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean doesCacheJars() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testDoesCacheJars_2()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		boolean result = fixture.doesCacheJars();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the IPath getCacheLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetCacheLocation_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		IPath result = fixture.getCacheLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IPath getCacheLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCacheLocation_2()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		IPath result = fixture.getCacheLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheJars(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetCacheJars_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();
		boolean value = true;

		fixture.setCacheJars(value);

		// add additional test code here
	}

	/**
	 * Run the IStatus validate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testValidate_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		IStatus result = fixture.validate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus validate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testValidate_2()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();

		IStatus result = fixture.validate();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus validateClasspath(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testValidateClasspath_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();
		File javaInstanceDir = new File("");

		IStatus result = fixture.validateClasspath(javaInstanceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus validateClasspath(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testValidateClasspath_2()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();
		File javaInstanceDir = new File("");

		IStatus result = fixture.validateClasspath(javaInstanceDir);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus validateName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testValidateName_1()
		throws Exception {
		SapNWRuntime fixture = new SapNW710Runtime();
		String name = "";

		IStatus result = fixture.validateName(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
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
	 * @generatedBy CodePro at 4/8/14 11:09 AM
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
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWRuntimeTest.class);
	}
}