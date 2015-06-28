package com.sap.engine.services.dc.wsgate;

import java.net.URL;
import java.rmi.Remote;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.NullProvider;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DeployWSServiceLocatorTest</code> contains tests for the class <code>{@link DeployWSServiceLocator}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployWSServiceLocatorTest {
	/**
	 * Run the DeployWSServiceLocator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeployWSServiceLocator_1()
		throws Exception {

		DeployWSServiceLocator result = new DeployWSServiceLocator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the DeployWSServiceLocator(EngineConfiguration) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeployWSServiceLocator_2()
		throws Exception {
		EngineConfiguration config = new NullProvider();

		DeployWSServiceLocator result = new DeployWSServiceLocator(config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the DeployWSServiceLocator(String,QName) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDeployWSServiceLocator_3()
		throws Exception {
		String wsdlLoc = "";
		QName sName = new QName("");

		DeployWSServiceLocator result = new DeployWSServiceLocator(wsdlLoc, sName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/DeployWSServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the DeployWSPortType getDeployWSPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSPort_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		DeployWSPortType result = fixture.getDeployWSPort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetDeployWSPort_2()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		DeployWSPortType result = fixture.getDeployWSPort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetDeployWSPort_3()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		DeployWSPortType result = fixture.getDeployWSPort();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPort(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSPort_4()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		URL portAddress = new URL("");

		DeployWSPortType result = fixture.getDeployWSPort(portAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DeployWSPortType getDeployWSPort(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSPort_5()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		URL portAddress = new URL("");

		DeployWSPortType result = fixture.getDeployWSPort(portAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDeployWSPortAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSPortAddress_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		String result = fixture.getDeployWSPortAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDeployWSPortWSDDServiceName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeployWSPortWSDDServiceName_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		String result = fixture.getDeployWSPortWSDDServiceName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_2()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_3()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		Class serviceEndpointInterface = null;

		Remote result = fixture.getPort(serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPort_4()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = null;
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPort_5()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPort_6()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_7()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = null;
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_8()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Remote getPort(QName,Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_9()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		Class serviceEndpointInterface = Object.class;

		Remote result = fixture.getPort(portName, serviceEndpointInterface);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Iterator getPorts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPorts_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		Iterator result = fixture.getPorts();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Iterator getPorts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPorts_2()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		Iterator result = fixture.getPorts();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the QName getServiceName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetServiceName_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");

		QName result = fixture.getServiceName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDeployWSPortEndpointAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDeployWSPortEndpointAddress_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		String address = "";

		fixture.setDeployWSPortEndpointAddress(address);

		// add additional test code here
	}

	/**
	 * Run the void setDeployWSPortWSDDServiceName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDeployWSPortWSDDServiceName_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		String name = "";

		fixture.setDeployWSPortWSDDServiceName(name);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointAddress(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetEndpointAddress_1()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		String portName = "DeployWSPort";
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointAddress(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testSetEndpointAddress_2()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		String portName = "";
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointAddress(QName,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetEndpointAddress_3()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointAddress(QName,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testSetEndpointAddress_4()
		throws Exception {
		DeployWSServiceLocator fixture = new DeployWSServiceLocator();
		fixture.setDeployWSPortWSDDServiceName("");
		fixture.setDeployWSPortEndpointAddress("");
		QName portName = new QName("");
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DeployWSServiceLocatorTest.class);
	}
}