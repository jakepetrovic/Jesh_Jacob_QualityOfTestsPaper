package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWSourcePathComputerDelegateTest</code> contains tests for the class <code>{@link SapNWSourcePathComputerDelegate}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:49 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWSourcePathComputerDelegateTest {
	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testComputeSourceContainers_1()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test
	public void testComputeSourceContainers_2()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testComputeSourceContainers_3()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testComputeSourceContainers_4()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testComputeSourceContainers_5()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ISourceContainer[] computeSourceContainers(ILaunchConfiguration,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testComputeSourceContainers_6()
		throws Exception {
		SapNWSourcePathComputerDelegate fixture = new SapNWSourcePathComputerDelegate();
		ILaunchConfiguration configuration = null;
		IProgressMonitor monitor = new NullProgressMonitor();

		ISourceContainer[] result = fixture.computeSourceContainers(configuration, monitor);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:49 AM
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
	 * @generatedBy CodePro at 4/8/14 10:49 AM
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
	 * @generatedBy CodePro at 4/8/14 10:49 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWSourcePathComputerDelegateTest.class);
	}
}