package com.sap.engine.services.dc.wsgate;

import java.net.URL;
import java.rmi.RemoteException;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DeployWSPortTypeBindingStubTest</code> contains tests for the class <code>{@link DeployWSPortTypeBindingStub}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:42 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployWSPortTypeBindingStubTest {
	/**
	 * Run the DeployWSPortTypeBindingStub() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeployWSPortTypeBindingStub_1()
		throws Exception {

		DeployWSPortTypeBindingStub result = new DeployWSPortTypeBindingStub();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeBindingStub : Unsupported major.minor version 51.0
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
	 * Run the DeployWSPortTypeBindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeployWSPortTypeBindingStub_2()
		throws Exception {
		javax.xml.rpc.Service service = new Service();

		DeployWSPortTypeBindingStub result = new DeployWSPortTypeBindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeBindingStub : Unsupported major.minor version 51.0
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
	 * Run the DeployWSPortTypeBindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeployWSPortTypeBindingStub_3()
		throws Exception {
		javax.xml.rpc.Service service = null;

		DeployWSPortTypeBindingStub result = new DeployWSPortTypeBindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeBindingStub : Unsupported major.minor version 51.0
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
	 * Run the DeployWSPortTypeBindingStub(URL,Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeployWSPortTypeBindingStub_4()
		throws Exception {
		URL endpointURL = new URL("");
		javax.xml.rpc.Service service = new DeployWSServiceLocator();

		DeployWSPortTypeBindingStub result = new DeployWSPortTypeBindingStub(endpointURL, service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSPortTypeBindingStub : Unsupported major.minor version 51.0
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
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testCreateCall_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testCreateCall_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testCreateCall_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testCreateCall_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testCreateCall_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployResult deploy(ArchiveFile[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeploy_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDeploy_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDeploy_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDeploy_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testDeploy_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testDeployLocal_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDeployLocal_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDeployLocal_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDeployLocal_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testDeployLocal_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testGetApplications_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetApplications_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetApplications_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetApplications_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetApplications_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
		Option[] options = new Option[] {};

		Application[] result = fixture.getApplications(options);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetVersion_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetVersion_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetVersion_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetVersion_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application[] start(Application[],Option[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStart_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStart_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStart_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStart_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStop_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStop_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStop_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStop_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test
	public void testUndeploy_1()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testUndeploy_2()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testUndeploy_3()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testUndeploy_4()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub(new URL(""), new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testUndeploy_5()
		throws Exception {
		DeployWSPortTypeBindingStub fixture = new DeployWSPortTypeBindingStub((URL) null, new DeployWSServiceLocator());
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
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
	 * @generatedBy CodePro at 4/8/14 10:42 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DeployWSPortTypeBindingStubTest.class);
	}
}