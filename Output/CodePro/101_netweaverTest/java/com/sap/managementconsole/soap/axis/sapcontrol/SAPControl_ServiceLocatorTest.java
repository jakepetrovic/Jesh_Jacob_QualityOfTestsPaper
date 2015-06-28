package com.sap.managementconsole.soap.axis.sapcontrol;

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
 * The class <code>SAPControl_ServiceLocatorTest</code> contains tests for the class <code>{@link SAPControl_ServiceLocator}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:48 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAPControl_ServiceLocatorTest {
	/**
	 * Run the SAPControl_ServiceLocator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSAPControl_ServiceLocator_1()
		throws Exception {

		SAPControl_ServiceLocator result = new SAPControl_ServiceLocator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_ServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the SAPControl_ServiceLocator(EngineConfiguration) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSAPControl_ServiceLocator_2()
		throws Exception {
		EngineConfiguration config = new NullProvider();

		SAPControl_ServiceLocator result = new SAPControl_ServiceLocator(config);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_ServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the SAPControl_ServiceLocator(String,QName) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSAPControl_ServiceLocator_3()
		throws Exception {
		String wsdlLoc = "";
		QName sName = new QName("");

		SAPControl_ServiceLocator result = new SAPControl_ServiceLocator(wsdlLoc, sName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_ServiceLocator : Unsupported major.minor version 51.0
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
	 * Run the Remote getPort(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_2()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_3()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPort_4()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPort_5()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPort_6()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_7()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_8()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetPort_9()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPorts_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		Iterator result = fixture.getPorts();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Iterator getPorts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetPorts_2()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		Iterator result = fixture.getPorts();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetSAPControl_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		SAPControlPortType result = fixture.getSAPControl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetSAPControl_2()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		SAPControlPortType result = fixture.getSAPControl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testGetSAPControl_3()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		SAPControlPortType result = fixture.getSAPControl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControl(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetSAPControl_4()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		URL portAddress = new URL("");

		SAPControlPortType result = fixture.getSAPControl(portAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPControlPortType getSAPControl(URL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetSAPControl_5()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		URL portAddress = new URL("");

		SAPControlPortType result = fixture.getSAPControl(portAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSAPControlAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetSAPControlAddress_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		String result = fixture.getSAPControlAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getSAPControlWSDDServiceName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetSAPControlWSDDServiceName_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		String result = fixture.getSAPControlWSDDServiceName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the QName getServiceName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testGetServiceName_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");

		QName result = fixture.getServiceName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setEndpointAddress(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSetEndpointAddress_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		String portName = "SAPControl";
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
	}

	/**
	 * Run the void setEndpointAddress(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testSetEndpointAddress_2()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSetEndpointAddress_3()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test(expected = javax.xml.rpc.ServiceException.class)
	public void testSetEndpointAddress_4()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		QName portName = new QName("");
		String address = "";

		fixture.setEndpointAddress(portName, address);

		// add additional test code here
	}

	/**
	 * Run the void setSAPControlEndpointAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSetSAPControlEndpointAddress_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		String address = "";

		fixture.setSAPControlEndpointAddress(address);

		// add additional test code here
	}

	/**
	 * Run the void setSAPControlWSDDServiceName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	@Test
	public void testSetSAPControlWSDDServiceName_1()
		throws Exception {
		SAPControl_ServiceLocator fixture = new SAPControl_ServiceLocator();
		fixture.setSAPControlEndpointAddress("");
		fixture.setSAPControlWSDDServiceName("");
		String name = "";

		fixture.setSAPControlWSDDServiceName(name);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:48 AM
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
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
	 * @generatedBy CodePro at 4/8/14 10:48 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SAPControl_ServiceLocatorTest.class);
	}
}