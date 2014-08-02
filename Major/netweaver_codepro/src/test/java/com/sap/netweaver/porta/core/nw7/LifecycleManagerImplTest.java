package com.sap.netweaver.porta.core.nw7;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DebugSessionInfo;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.ServerState;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

/**
 * The class <code>LifecycleManagerImplTest</code> contains tests for the class <code>{@link LifecycleManagerImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:22 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class LifecycleManagerImplTest {
	/**
	 * Run the LifecycleManagerImpl(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testLifecycleManagerImpl_1()
		throws Exception {
		String host = "";
		int instNr = 1;

		LifecycleManagerImpl result = new LifecycleManagerImpl(host, instNr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/LifecycleManagerImpl : Unsupported major.minor version 51.0
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
	 * Run the LifecycleManagerImpl(String,int,LMUtils) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testLifecycleManagerImpl_2()
		throws Exception {
		String host = "";
		int instNr = 1;
		LMUtils utils = new LMUtilsImpl();

		LifecycleManagerImpl result = new LifecycleManagerImpl(host, instNr, utils);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/LifecycleManagerImpl : Unsupported major.minor version 51.0
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
	 * Run the void disableDebugging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testDisableDebugging_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		String key = "";

		fixture.disableDebugging(key);

		// add additional test code here
	}

	/**
	 * Run the void disableDebugging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testDisableDebugging_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		String key = "";

		fixture.disableDebugging(key);

		// add additional test code here
	}

	/**
	 * Run the void disableDebugging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testDisableDebugging_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		String key = "";

		fixture.disableDebugging(key);

		// add additional test code here
	}

	/**
	 * Run the void disableDebugging(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testDisableDebugging_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		String key = "";

		fixture.disableDebugging(key);

		// add additional test code here
	}

	/**
	 * Run the DebugSessionInfo enableDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testEnableDebugging_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		DebugSessionInfo result = fixture.enableDebugging();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DebugSessionInfo enableDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testEnableDebugging_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		DebugSessionInfo result = fixture.enableDebugging();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DebugSessionInfo enableDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testEnableDebugging_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		DebugSessionInfo result = fixture.enableDebugging();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DebugSessionInfo enableDebugging() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testEnableDebugging_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		DebugSessionInfo result = fixture.enableDebugging();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		ServerState result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetState_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		ServerState result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetState_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		ServerState result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerState getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testGetState_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		ServerState result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testInitialize_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the boolean initialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testInitialized_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		boolean result = fixture.initialized();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean initialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testInitialized_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		boolean result = fixture.initialized();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testRestart_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testRestart_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testRestart_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void restart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testRestart_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.restart();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStart_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_2()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_3()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:22 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStop_4()
		throws Exception {
		LifecycleManagerImpl fixture = new LifecycleManagerImpl("", 1, new LMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		fixture.stop();

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
		new org.junit.runner.JUnitCore().run(LifecycleManagerImplTest.class);
	}
}