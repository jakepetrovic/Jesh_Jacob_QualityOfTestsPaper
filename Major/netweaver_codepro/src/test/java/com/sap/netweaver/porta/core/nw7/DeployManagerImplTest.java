package com.sap.netweaver.porta.core.nw7;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.DeployResult;
import com.sap.netweaver.porta.core.NotAuthorizedException;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

/**
 * The class <code>DeployManagerImplTest</code> contains tests for the class <code>{@link DeployManagerImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:39 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployManagerImplTest {
	/**
	 * Run the DeployManagerImpl(String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testDeployManagerImpl_1()
		throws Exception {
		String host = "";
		int instNr = 1;

		DeployManagerImpl result = new DeployManagerImpl(host, instNr);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/DeployManagerImpl : Unsupported major.minor version 51.0
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
	 * Run the DeployManagerImpl(String,int,LMUtils,DMUtils) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testDeployManagerImpl_2()
		throws Exception {
		String host = "";
		int instNr = 1;
		LMUtils lmUtils = new LMUtilsImpl();
		DMUtils dmUtils = new DMUtilsImpl();

		DeployManagerImpl result = new DeployManagerImpl(host, instNr, lmUtils, dmUtils);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/DeployManagerImpl : Unsupported major.minor version 51.0
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
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testDeploy_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testDeploy_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testDeploy_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(File[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testDeploy_4()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		File[] archives = new File[] {};

		DeployResult result = fixture.deploy(archives);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetApplications_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		com.sap.netweaver.porta.core.Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetApplications_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		com.sap.netweaver.porta.core.Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetApplications_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		com.sap.netweaver.porta.core.Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetApplications_4()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		com.sap.netweaver.porta.core.Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] getApplications() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testGetApplications_5()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		com.sap.netweaver.porta.core.Application[] result = fixture.getApplications();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testInitialized_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testInitialized_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";

		boolean result = fixture.initialized();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStart_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] start(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStart_4()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.start(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testStop_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the com.sap.netweaver.porta.core.Application[] stop(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testStop_4()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		com.sap.netweaver.porta.core.Application[] result = fixture.stop(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testUndeploy_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUndeploy_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testUndeploy_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.NotAuthorizedException.class)
	public void testUndeploy_4()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1, new LMUtilsImpl(), new DMUtilsImpl());
		fixture.instNr = 1;
		fixture.callback = new SnippetUseDeployManager();
		fixture.host = "";
		com.sap.netweaver.porta.core.Application[] apps = new com.sap.netweaver.porta.core.Application[] {new ApplicationImpl(new Application())};

		DeployResult result = fixture.undeploy(apps);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeployManagerImplTest.class);
	}
}