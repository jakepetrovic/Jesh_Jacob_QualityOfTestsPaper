package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EERemoteObjectTest</code> contains tests for the class <code>{@link J2EERemoteObject}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:58 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EERemoteObjectTest {
	/**
	 * Run the J2EERemoteObject() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testJ2EERemoteObject_1()
		throws Exception {

		J2EERemoteObject result = new J2EERemoteObject();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EERemoteObject : Unsupported major.minor version 51.0
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
	 * Run the J2EERemoteObject(int,String,int,String,String,int,int,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testJ2EERemoteObject_2()
		throws Exception {
		int idHash = 1;
		String address = "";
		int port = 1;
		String protocol = "";
		String direction = "";
		int stubs = 1;
		int implementations = 1;
		String creationTime = "";
		String updateTime = "";
		String processname = "";

		J2EERemoteObject result = new J2EERemoteObject(idHash, address, port, protocol, direction, stubs, implementations, creationTime, updateTime, processname);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EERemoteObject : Unsupported major.minor version 51.0
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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		Object obj = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		Object obj = new J2EERemoteObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		Object obj = new J2EERemoteObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, (String) null, 1, (String) null, (String) null, 1, 1, (String) null, (String) null, (String) null);
		Object obj = new J2EERemoteObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetAddress_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCreationTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetCreationTime_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getCreationTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EERemoteObject.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDirection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetDirection_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getDirection();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getIdHash() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetIdHash_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		int result = fixture.getIdHash();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getImplementations() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetImplementations_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		int result = fixture.getImplementations();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetPort_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		int result = fixture.getPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getProtocol() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetProtocol_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getProtocol();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EERemoteObject.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getStubs() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetStubs_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		int result = fixture.getStubs();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EERemoteObject.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testGetUpdateTime_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		String result = fixture.getUpdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, (String) null, 1, (String) null, "", 1, 1, "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", (String) null, 1, 1, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetAddress_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String address = "";

		fixture.setAddress(address);

		// add additional test code here
	}

	/**
	 * Run the void setCreationTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetCreationTime_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String creationTime = "";

		fixture.setCreationTime(creationTime);

		// add additional test code here
	}

	/**
	 * Run the void setDirection(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetDirection_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String direction = "";

		fixture.setDirection(direction);

		// add additional test code here
	}

	/**
	 * Run the void setIdHash(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetIdHash_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		int idHash = 1;

		fixture.setIdHash(idHash);

		// add additional test code here
	}

	/**
	 * Run the void setImplementations(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetImplementations_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		int implementations = 1;

		fixture.setImplementations(implementations);

		// add additional test code here
	}

	/**
	 * Run the void setPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetPort_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		int port = 1;

		fixture.setPort(port);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setProtocol(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetProtocol_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String protocol = "";

		fixture.setProtocol(protocol);

		// add additional test code here
	}

	/**
	 * Run the void setStubs(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetStubs_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		int stubs = 1;

		fixture.setStubs(stubs);

		// add additional test code here
	}

	/**
	 * Run the void setUpdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	@Test
	public void testSetUpdateTime_1()
		throws Exception {
		J2EERemoteObject fixture = new J2EERemoteObject(1, "", 1, "", "", 1, 1, "", "", "");
		String updateTime = "";

		fixture.setUpdateTime(updateTime);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:58 AM
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
	 * @generatedBy CodePro at 4/8/14 10:58 AM
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
	 * @generatedBy CodePro at 4/8/14 10:58 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EERemoteObjectTest.class);
	}
}