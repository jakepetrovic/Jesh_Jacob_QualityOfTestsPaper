package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.eclipse.debug.internal.ui.launchConfigurations.LaunchConfigurationsDialog;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWLaunchConfigurationTabGroupTest</code> contains tests for the class <code>{@link SapNWLaunchConfigurationTabGroup}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:31 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWLaunchConfigurationTabGroupTest {
	/**
	 * Run the void createTabs(ILaunchConfigurationDialog,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	@Test
	public void testCreateTabs_1()
		throws Exception {
		SapNWLaunchConfigurationTabGroup fixture = new SapNWLaunchConfigurationTabGroup();
		ILaunchConfigurationDialog dialog = LaunchConfigurationsDialog.getCurrentlyVisibleLaunchConfigurationDialog();
		String mode = "";

		fixture.createTabs(dialog, mode);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:31 AM
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
	 * @generatedBy CodePro at 4/8/14 11:31 AM
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
	 * @generatedBy CodePro at 4/8/14 11:31 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWLaunchConfigurationTabGroupTest.class);
	}
}