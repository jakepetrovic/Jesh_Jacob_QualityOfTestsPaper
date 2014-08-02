package com.sap.engine.services.dc.wsgate;

import java.rmi.RemoteException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DeployWSPortTypeProxyTest</code> contains tests for the class <code>{@link DeployWSPortTypeProxy}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:43 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployWSPortTypeProxyTest {
	/**
	 * Run the DeployWSPortTypeProxy() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testDeployWSPortTypeProxy_1()
		throws Exception {

		DeployWSPortTypeProxy result = new DeployWSPortTypeProxy();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeProxy : Unsupported major.minor version 51.0
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
	 * Run the DeployWSPortTypeProxy(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testDeployWSPortTypeProxy_2()
		throws Exception {
		String endpoint = "";

		DeployWSPortTypeProxy result = new DeployWSPortTypeProxy(endpoint);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeProxy : Unsupported major.minor version 51.0
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
	 * Run the DeployResult deploy(ArchiveFile[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testDeploy_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		ArchiveFile[] archiveFiles = new ArchiveFile[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.deploy(archiveFiles, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(ArchiveFile[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDeploy_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		ArchiveFile[] archiveFiles = new ArchiveFile[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.deploy(archiveFiles, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deployLocal(String[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testDeployLocal_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		String[] archivePaths = new String[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.deployLocal(archivePaths, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deployLocal(String[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDeployLocal_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		String[] archivePaths = new String[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.deployLocal(archivePaths, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getApplications(Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testGetApplications_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Option[] options = new Option[] {};

		Application[] result = fixture.getApplications(options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] getApplications(Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetApplications_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Option[] options = new Option[] {};

		Application[] result = fixture.getApplications(options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPortType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetDeployWSPortType_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");

		DeployWSPortType result = fixture.getDeployWSPortType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPortType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetDeployWSPortType_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");

		DeployWSPortType result = fixture.getDeployWSPortType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getEndpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetEndpoint_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");

		String result = fixture.getEndpoint();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetVersion_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setEndpoint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetEndpoint_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		String endpoint = "";

		fixture.setEndpoint(endpoint);

		// add additional test code here
	}

	/**
	 * Run the void setEndpoint(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetEndpoint_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		String endpoint = "";

		fixture.setEndpoint(endpoint);

		// add additional test code here
	}

	/**
	 * Run the Application[] start(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testStart_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		Application[] result = fixture.start(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStart_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		Application[] result = fixture.start(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testStop_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		Application[] result = fixture.stop(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] stop(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStop_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		Application[] result = fixture.stop(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = com.sap.engine.services.dc.wsgate.DeployFault.class)
	public void testUndeploy_1()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.undeploy(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult undeploy(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUndeploy_2()
		throws Exception {
		DeployWSPortTypeProxy fixture = new DeployWSPortTypeProxy("");
		Application[] apps = new Application[] {};
		Option[] options = new Option[] {};

		DeployResult result = fixture.undeploy(apps, options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
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
	 * @generatedBy CodePro at 4/8/14 10:43 AM
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
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeployWSPortTypeProxyTest.class);
	}
}