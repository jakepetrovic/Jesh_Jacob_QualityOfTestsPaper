package com.sap.netweaver.porta.ide.eclipse.server.runtime;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.wst.common.project.facet.core.IFacetedProject;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.internal.Runtime;
import org.eclipse.wst.server.core.internal.RuntimeWorkingCopy;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWRuntimeClasspathProviderTest</code> contains tests for the class <code>{@link SapNWRuntimeClasspathProvider}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWRuntimeClasspathProviderTest {
	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_1()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_2()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IFacetedProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_3()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IFacetedProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IFacetedProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_4()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IFacetedProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IFacetedProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_5()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IFacetedProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IFacetedProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_6()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IFacetedProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IClasspathEntry[] resolveClasspathContainer(IFacetedProject,IRuntime) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testResolveClasspathContainer_7()
		throws Exception {
		SapNWRuntimeClasspathProvider fixture = new SapNWRuntimeClasspathProvider();
		IFacetedProject project = null;
		IRuntime runtime = new RuntimeWorkingCopy(new Runtime((IFile) null));

		IClasspathEntry[] result = fixture.resolveClasspathContainer(project, runtime);

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
		new org.junit.runner.JUnitCore().run(SapNWRuntimeClasspathProviderTest.class);
	}
}