package com.sap.netweaver.porta.mon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PortaMonTest</code> contains tests for the class <code>{@link PortaMon}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:22 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PortaMonTest {
	/**
	 * Run the PortaMon() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testPortaMon_1()
		throws Exception {

		PortaMon result = new PortaMon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/mon/PortaMon : Unsupported major.minor version 51.0
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
	 * Run the DeployManagerAuthenticationCallback getDeployManagerAuthenticationCallback() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetDeployManagerAuthenticationCallback_1()
		throws Exception {

		DeployManagerAuthenticationCallback result = PortaMon.getDeployManagerAuthenticationCallback();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BufferedReader getIn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetIn_1()
		throws Exception {

		BufferedReader result = PortaMon.getIn();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LifecycleManagerAuthenticationCallback getLifecycleManagerAuthenticationCallback() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetLifecycleManagerAuthenticationCallback_1()
		throws Exception {

		LifecycleManagerAuthenticationCallback result = PortaMon.getLifecycleManagerAuthenticationCallback();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrintStream getOut() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetOut_1()
		throws Exception {

		PrintStream result = PortaMon.getOut();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Properties getServerProps() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetServerProps_1()
		throws Exception {

		Properties result = PortaMon.getServerProps();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void go() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGo_1()
		throws Exception {
		PortaMon fixture = new PortaMon();

		fixture.go();

		// add additional test code here
	}

	/**
	 * Run the void go() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGo_2()
		throws Exception {
		PortaMon fixture = new PortaMon();

		fixture.go();

		// add additional test code here
	}

	/**
	 * Run the void go() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testGo_3()
		throws Exception {
		PortaMon fixture = new PortaMon();

		fixture.go();

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PortaMon.main(args);

		// add additional test code here
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		PortaMon.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
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
	 * @generatedBy CodePro at 4/8/14 11:22 AM
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
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PortaMonTest.class);
	}
}