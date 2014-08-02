package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.jdt.internal.launching.JavaSourceLookupDirector;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWLaunchConfigurationDelegateTest</code> contains tests for the class <code>{@link SapNWLaunchConfigurationDelegate}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:40 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWLaunchConfigurationDelegateTest {
	/**
	 * Run the void launch(ILaunchConfiguration,String,ILaunch,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testLaunch_1()
		throws Exception {
		SapNWLaunchConfigurationDelegate fixture = new SapNWLaunchConfigurationDelegate();
		ILaunchConfiguration configuration = null;
		String mode = "";
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.launch(configuration, mode, launch, monitor);

		// add additional test code here
	}

	/**
	 * Run the void launch(ILaunchConfiguration,String,ILaunch,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testLaunch_2()
		throws Exception {
		SapNWLaunchConfigurationDelegate fixture = new SapNWLaunchConfigurationDelegate();
		ILaunchConfiguration configuration = null;
		String mode = "";
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.launch(configuration, mode, launch, monitor);

		// add additional test code here
	}

	/**
	 * Run the void launch(ILaunchConfiguration,String,ILaunch,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testLaunch_3()
		throws Exception {
		SapNWLaunchConfigurationDelegate fixture = new SapNWLaunchConfigurationDelegate();
		ILaunchConfiguration configuration = null;
		String mode = "";
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.launch(configuration, mode, launch, monitor);

		// add additional test code here
	}

	/**
	 * Run the void launch(ILaunchConfiguration,String,ILaunch,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testLaunch_4()
		throws Exception {
		SapNWLaunchConfigurationDelegate fixture = new SapNWLaunchConfigurationDelegate();
		ILaunchConfiguration configuration = null;
		String mode = "";
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.launch(configuration, mode, launch, monitor);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SapNWLaunchConfigurationDelegateTest.class);
	}
}