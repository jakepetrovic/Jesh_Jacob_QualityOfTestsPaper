package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.wst.server.core.IModule;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.ide.eclipse.server.SapNWRefreshStateJob;

/**
 * The class <code>SapNWPublishOperationTest</code> contains tests for the class <code>{@link SapNWPublishOperation}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWPublishOperationTest {
	/**
	 * Run the SapNWPublishOperation(SapNWServerBehavior,int,IModule[],Integer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSapNWPublishOperation_1()
		throws Exception {
		SapNWServerBehavior serverControl = new SapNWServerBehavior();
		int kind = 1;
		IModule[] module = new IModule[] {};
		Integer deltaKind = Integer.valueOf(1);

		SapNWPublishOperation result = new SapNWPublishOperation(serverControl, kind, module, deltaKind);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/control/SapNWPublishOperation : Unsupported major.minor version 51.0
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
	 * Run the void execute(IProgressMonitor,IAdaptable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		SapNWPublishOperation fixture = new SapNWPublishOperation(new SapNWServerBehavior(), 1, new IModule[] {}, Integer.valueOf(1));
		IProgressMonitor monitor = new NullProgressMonitor();
		IAdaptable info = new SapNWRefreshStateJob();

		fixture.execute(monitor, info);

		// add additional test code here
	}

	/**
	 * Run the void execute(IProgressMonitor,IAdaptable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testExecute_2()
		throws Exception {
		SapNWPublishOperation fixture = new SapNWPublishOperation(new SapNWServerBehavior(), 1, new IModule[] {}, Integer.valueOf(1));
		IProgressMonitor monitor = new NullProgressMonitor();
		IAdaptable info = new SapNWRefreshStateJob();

		fixture.execute(monitor, info);

		// add additional test code here
	}

	/**
	 * Run the void execute(IProgressMonitor,IAdaptable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testExecute_3()
		throws Exception {
		SapNWPublishOperation fixture = new SapNWPublishOperation(new SapNWServerBehavior(), 4, new IModule[] {}, Integer.valueOf(1));
		IProgressMonitor monitor = new NullProgressMonitor();
		IAdaptable info = new SapNWRefreshStateJob();

		fixture.execute(monitor, info);

		// add additional test code here
	}

	/**
	 * Run the int getKind() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetKind_1()
		throws Exception {
		SapNWPublishOperation fixture = new SapNWPublishOperation(new SapNWServerBehavior(), 1, new IModule[] {}, Integer.valueOf(1));

		int result = fixture.getKind();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getOrder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetOrder_1()
		throws Exception {
		SapNWPublishOperation fixture = new SapNWPublishOperation(new SapNWServerBehavior(), 1, new IModule[] {}, Integer.valueOf(1));

		int result = fixture.getOrder();

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(SapNWPublishOperationTest.class);
	}
}