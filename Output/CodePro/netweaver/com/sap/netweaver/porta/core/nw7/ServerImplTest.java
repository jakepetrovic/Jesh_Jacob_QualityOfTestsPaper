package com.sap.netweaver.porta.core.nw7;

import java.net.InetSocketAddress;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DeployManager;
import com.sap.netweaver.porta.core.LifecycleManager;

/**
 * The class <code>ServerImplTest</code> contains tests for the class <code>{@link ServerImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:15 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ServerImplTest {
	/**
	 * Run the ServerImpl(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testServerImpl_1()
		throws Exception {
		String host = "";
		int instNr = 1;

		ServerImpl result = new ServerImpl(host, instNr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/ServerImpl : Unsupported major.minor version 51.0
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
	 * Run the ServerImpl(String,int,LMUtils) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testServerImpl_2()
		throws Exception {
		String host = "";
		int instNr = 1;
		LMUtils utils = new LMUtilsImpl();

		ServerImpl result = new ServerImpl(host, instNr, utils);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/ServerImpl : Unsupported major.minor version 51.0
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
	 * Run the DeployManager getDeployManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetDeployManager_1()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		DeployManager result = fixture.getDeployManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployManager getDeployManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetDeployManager_2()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		DeployManager result = fixture.getDeployManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetHttpAccessPoint_1()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_2()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_3()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_4()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_5()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_6()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetHttpAccessPoint_7()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetSocketAddress getHttpAccessPoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetHttpAccessPoint_8()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		InetSocketAddress result = fixture.getHttpAccessPoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LifecycleManager getLifecycleManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetLifecycleManager_1()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		LifecycleManager result = fixture.getLifecycleManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LifecycleManager getLifecycleManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetLifecycleManager_2()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		LifecycleManager result = fixture.getLifecycleManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetSystemName_1()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		String result = fixture.getSystemName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetSystemName_2()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		String result = fixture.getSystemName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetSystemName_3()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		String result = fixture.getSystemName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSystemName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetSystemName_4()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		String result = fixture.getSystemName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testPing_1()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		fixture.ping();

		// add additional test code here
	}

	/**
	 * Run the void ping() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testPing_2()
		throws Exception {
		ServerImpl fixture = new ServerImpl("", 1, new LMUtilsImpl());

		fixture.ping();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServerImplTest.class);
	}
}