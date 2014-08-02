package com.sap.netweaver.porta.ide.eclipse.server.control;

import java.io.File;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.jdt.internal.launching.JavaSourceLookupDirector;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.Application;
import com.sap.netweaver.porta.core.NotAuthorizedException;

/**
 * The class <code>SapNWServerBehaviorTest</code> contains tests for the class <code>{@link SapNWServerBehavior}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWServerBehaviorTest {
	/**
	 * Run the IStatus canPublish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanPublish_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		IStatus result = fixture.canPublish();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canPublish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanPublish_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		IStatus result = fixture.canPublish();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canRestart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanRestart_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String mode = "";

		IStatus result = fixture.canRestart(mode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canRestart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanRestart_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String mode = "";

		IStatus result = fixture.canRestart(mode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canStart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanStart_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "";

		IStatus result = fixture.canStart(launchMode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canStart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanStart_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "";

		IStatus result = fixture.canStart(launchMode);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanStop_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		IStatus result = fixture.canStop();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanStop_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		IStatus result = fixture.canStop();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canStop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanStop_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		IStatus result = fixture.canStop();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getPublishedApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPublishedApplications_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		Application[] result = fixture.getPublishedApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getPublishedApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetPublishedApplications_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		Application[] result = fixture.getPublishedApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getPublishedApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetPublishedApplications_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		Application[] result = fixture.getPublishedApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getPublishedApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testGetPublishedApplications_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		Application[] result = fixture.getPublishedApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initialize(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.initialize(monitor);

		// add additional test code here
	}

	/**
	 * Run the void initialize(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testInitialize_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.initialize(monitor);

		// add additional test code here
	}

	/**
	 * Run the void initialize(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testInitialize_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.initialize(monitor);

		// add additional test code here
	}

	/**
	 * Run the void initialize(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testInitialize_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.initialize(monitor);

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testLaunchRemoteDebugging_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testLaunchRemoteDebugging_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testLaunchRemoteDebugging_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testLaunchRemoteDebugging_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testLaunchRemoteDebugging_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testLaunchRemoteDebugging_6()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testLaunchRemoteDebugging_7()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void launchRemoteDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testLaunchRemoteDebugging_8()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.launchRemoteDebugging();

		// add additional test code here
	}

	/**
	 * Run the void publish(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testPublish_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		File archiveFile = new File("");

		fixture.publish(archiveFile);

		// add additional test code here
	}

	/**
	 * Run the void publish(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testPublish_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		File archiveFile = new File("");

		fixture.publish(archiveFile);

		// add additional test code here
	}

	/**
	 * Run the void publish(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testPublish_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		File archiveFile = new File("");

		fixture.publish(archiveFile);

		// add additional test code here
	}

	/**
	 * Run the void publish(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testPublish_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		File archiveFile = new File("");

		fixture.publish(archiveFile);

		// add additional test code here
	}

	/**
	 * Run the void publish(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.ide.eclipse.server.control.PublishException.class)
	public void testPublish_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		File archiveFile = new File("");

		fixture.publish(archiveFile);

		// add additional test code here
	}

	/**
	 * Run the void publishServer(int,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testPublishServer_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		int kind = 1;
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.publishServer(kind, monitor);

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_6()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_7()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_8()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_9()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_10()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_11()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_12()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_13()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_14()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_15()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void refreshServerState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRefreshServerState_16()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();

		fixture.refreshServerState();

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "run";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "debug";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_6()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "run";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testRestart_7()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "debug";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testRestart_8()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "debug";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void restart(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.debug.core.DebugException.class)
	public void testRestart_9()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String launchMode = "run";

		fixture.restart(launchMode);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_6()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetupLaunch_7()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setupLaunch(ILaunch,String,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testSetupLaunch_8()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		ILaunch launch = new Launch((ILaunchConfiguration) null, "", new JavaSourceLookupDirector());
		String launchMode = "";
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setupLaunch(launch, launchMode, monitor);

		// add additional test code here
	}

	/**
	 * Run the void stop(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		boolean force = true;

		fixture.stop(force);

		// add additional test code here
	}

	/**
	 * Run the void stop(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		boolean force = true;

		fixture.stop(force);

		// add additional test code here
	}

	/**
	 * Run the void stop(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		boolean force = true;

		fixture.stop(force);

		// add additional test code here
	}

	/**
	 * Run the void stop(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testStop_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		boolean force = true;

		fixture.stop(force);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testUnpublish_1()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testUnpublish_2()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testUnpublish_3()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUnpublish_4()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUnpublish_5()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUnpublish_6()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUnpublish_7()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testUnpublish_8()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
	}

	/**
	 * Run the void unpublish(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testUnpublish_9()
		throws Exception {
		SapNWServerBehavior fixture = new SapNWServerBehavior();
		String appName = "";

		fixture.unpublish(appName);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SapNWServerBehaviorTest.class);
	}
}