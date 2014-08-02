package com.sap.netweaver.porta.ide.eclipse.server.ui.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.ui.wizard.IWizardHandle;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SapNWServerWizardFragmentTest</code> contains tests for the class <code>{@link SapNWServerWizardFragment}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:40 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWServerWizardFragmentTest {
	/**
	 * Run the SapNWServerWizardFragment() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSapNWServerWizardFragment_1()
		throws Exception {

		SapNWServerWizardFragment result = new SapNWServerWizardFragment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/ui/wizard/SapNWServerWizardFragment : Unsupported major.minor version 51.0
		//       at java.lang.ClassLoader.defineClass1(Native Method)
		//       at java.lang.ClassLoader.defineClassCond(ClassLoader.java:637)
		//       at java.lang.ClassLoader.defineClass(ClassLoader.java:621)
		//       at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:141)
		//       at java.net.URLClassLoader.defineClass(URLClassLoader.java:283)
		//       at java.net.URLClassLoader.access$000(URLClassLoader.java:58)
		//       at java.net.URLClassLoader$1.run(URLClassLoader.java:197)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:306)
		//       at com.instantiations.assist.eclipse.junit.execution.core.UserDefinedClassLoader.loadClass(UserDefinedClassLoader.java:62)
		//       at java.lang.ClassLoader.loadClass(ClassLoader.java:247)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionContextImpl.getClass(ExecutionContextImpl.java:99)
		//       at com.instantiations.eclipse.analysis.expression.model.SimpleTypeExpression.execute(SimpleTypeExpression.java:205)
		//       at com.instantiations.eclipse.analysis.expression.model.InstanceCreationExpression.execute(InstanceCreationExpression.java:425)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertNotNull(result);
	}

	/**
	 * Run the Composite createComposite(Composite,IWizardHandle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testCreateComposite_1()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);
		IWizardHandle wizard = null;

		Composite result = fixture.createComposite(parent, wizard);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void enter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEnter_1()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		fixture.enter();

		// add additional test code here
	}

	/**
	 * Run the void enter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEnter_2()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = null;

		fixture.enter();

		// add additional test code here
	}

	/**
	 * Run the boolean hasComposite() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHasComposite_1()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		boolean result = fixture.hasComposite();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testIsComplete_1()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		boolean result = fixture.isComplete();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testIsComplete_2()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		boolean result = fixture.isComplete();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testIsComplete_3()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		boolean result = fixture.isComplete();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isComplete() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testIsComplete_4()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);

		boolean result = fixture.isComplete();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void performFinish(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testPerformFinish_1()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.performFinish(monitor);

		// add additional test code here
	}

	/**
	 * Run the void performFinish(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testPerformFinish_2()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.performFinish(monitor);

		// add additional test code here
	}

	/**
	 * Run the void performFinish(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testPerformFinish_3()
		throws Exception {
		SapNWServerWizardFragment fixture = new SapNWServerWizardFragment();
		fixture.createComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		fixture.comp = new SapNWServerComposite(new Composite(new Composite((Composite) null, 0), 1), (IWizardHandle) null);
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.performFinish(monitor);

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
		new org.junit.runner.JUnitCore().run(SapNWServerWizardFragmentTest.class);
	}
}