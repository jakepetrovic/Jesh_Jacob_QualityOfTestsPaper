package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jst.server.core.EJBBean;
import org.eclipse.wst.server.core.IModuleArtifact;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.internal.Server;
import org.eclipse.wst.server.core.util.WebResource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWLaunchableAdapterDelegateTest</code> contains tests for the class <code>{@link SapNWLaunchableAdapterDelegate}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWLaunchableAdapterDelegateTest {
	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_1()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new EJBBean();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_2()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new EJBBean();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_3()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new EJBBean();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_4()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new WebResource();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_5()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new WebResource();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_6()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new WebResource();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLaunchable_7()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new WebResource();

		Object result = fixture.getLaunchable(server, moduleArtifact);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getLaunchable(IServer,IModuleArtifact) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = org.eclipse.core.runtime.CoreException.class)
	public void testGetLaunchable_8()
		throws Exception {
		SapNWLaunchableAdapterDelegate fixture = new SapNWLaunchableAdapterDelegate();
		IServer server = new Server((IFile) null);
		IModuleArtifact moduleArtifact = new EJBBean();

		Object result = fixture.getLaunchable(server, moduleArtifact);

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
		new org.junit.runner.JUnitCore().run(SapNWLaunchableAdapterDelegateTest.class);
	}
}