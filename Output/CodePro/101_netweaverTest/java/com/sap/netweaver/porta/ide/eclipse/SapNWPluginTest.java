package com.sap.netweaver.porta.ide.eclipse;

import org.junit.*;
import static org.junit.Assert.*;
import org.osgi.framework.BundleContext;

/**
 * The class <code>SapNWPluginTest</code> contains tests for the class <code>{@link SapNWPlugin}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:16 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWPluginTest {
	/**
	 * Run the SapNWPlugin() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testSapNWPlugin_1()
		throws Exception {

		SapNWPlugin result = new SapNWPlugin();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/SapNWPlugin : Unsupported major.minor version 51.0
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
	 * Run the void errorDialog(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testErrorDialog_1()
		throws Exception {
		String title = "";
		String message = "";

		SapNWPlugin.errorDialog(title, message);

		// add additional test code here
	}

	/**
	 * Run the void errorDialog(String,String,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testErrorDialog_2()
		throws Exception {
		String title = "";
		String message = "";
		Throwable throwable = new Throwable();

		SapNWPlugin.errorDialog(title, message, throwable);

		// add additional test code here
	}

	/**
	 * Run the void errorDialog(String,String,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testErrorDialog_3()
		throws Exception {
		String title = "";
		String message = "";
		Throwable throwable = null;

		SapNWPlugin.errorDialog(title, message, throwable);

		// add additional test code here
	}

	/**
	 * Run the SapNWPlugin getDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testGetDefault_1()
		throws Exception {

		SapNWPlugin result = SapNWPlugin.getDefault();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void logError(String,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testLogError_1()
		throws Exception {
		String msg = "";
		Throwable t = new Throwable();

		SapNWPlugin.logError(msg, t);

		// add additional test code here
	}

	/**
	 * Run the void logInfo(String,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testLogInfo_1()
		throws Exception {
		String msg = "";
		Throwable t = new Throwable();

		SapNWPlugin.logInfo(msg, t);

		// add additional test code here
	}

	/**
	 * Run the void logWarning(String,Throwable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testLogWarning_1()
		throws Exception {
		String msg = "";
		Throwable t = new Throwable();

		SapNWPlugin.logWarning(msg, t);

		// add additional test code here
	}

	/**
	 * Run the void start(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		SapNWPlugin fixture = new SapNWPlugin();
		BundleContext context = null;

		fixture.start(context);

		// add additional test code here
	}

	/**
	 * Run the void start(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testStart_2()
		throws Exception {
		SapNWPlugin fixture = new SapNWPlugin();
		BundleContext context = null;

		fixture.start(context);

		// add additional test code here
	}

	/**
	 * Run the void stop(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		SapNWPlugin fixture = new SapNWPlugin();
		BundleContext context = null;

		fixture.stop(context);

		// add additional test code here
	}

	/**
	 * Run the void stop(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	@Test(expected = java.lang.Exception.class)
	public void testStop_2()
		throws Exception {
		SapNWPlugin fixture = new SapNWPlugin();
		BundleContext context = null;

		fixture.stop(context);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:16 AM
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
	 * @generatedBy CodePro at 4/8/14 11:16 AM
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
	 * @generatedBy CodePro at 4/8/14 11:16 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SapNWPluginTest.class);
	}
}