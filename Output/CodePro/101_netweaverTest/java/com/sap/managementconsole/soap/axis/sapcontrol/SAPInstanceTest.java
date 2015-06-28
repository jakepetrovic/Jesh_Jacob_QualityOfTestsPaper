package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SAPInstanceTest</code> contains tests for the class <code>{@link SAPInstance}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:39 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAPInstanceTest {
	/**
	 * Run the SAPInstance() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSAPInstance_1()
		throws Exception {

		SAPInstance result = new SAPInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPInstance : Unsupported major.minor version 51.0
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
	 * Run the SAPInstance(String,int,int,int,String,String,STATECOLOR) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSAPInstance_2()
		throws Exception {
		String hostname = "";
		int instanceNr = 1;
		int httpPort = 1;
		int httpsPort = 1;
		String startPriority = "";
		String features = "";
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		SAPInstance result = new SAPInstance(hostname, instanceNr, httpPort, httpsPort, startPriority, features, dispstatus);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPInstance : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
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
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		Object obj = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		Object obj = new SAPInstance();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		Object obj = new SAPInstance();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		SAPInstance fixture = new SAPInstance((String) null, 1, 1, 1, (String) null, (String) null, (STATECOLOR) null);
		Object obj = new SAPInstance();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		Object obj = new SAPInstance();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = SAPInstance.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getDispstatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetDispstatus_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		STATECOLOR result = fixture.getDispstatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFeatures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetFeatures_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		String result = fixture.getFeatures();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getHostname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetHostname_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		String result = fixture.getHostname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getHttpPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetHttpPort_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		int result = fixture.getHttpPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getHttpsPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetHttpsPort_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		int result = fixture.getHttpsPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getInstanceNr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetInstanceNr_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		int result = fixture.getInstanceNr();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = SAPInstance.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStartPriority() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetStartPriority_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		String result = fixture.getStartPriority();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = SAPInstance.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		SAPInstance fixture = new SAPInstance((String) null, 1, 1, 1, "", "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, (String) null, (String) null, (STATECOLOR) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setDispstatus(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetDispstatus_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		fixture.setDispstatus(dispstatus);

		// add additional test code here
	}

	/**
	 * Run the void setFeatures(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetFeatures_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		String features = "";

		fixture.setFeatures(features);

		// add additional test code here
	}

	/**
	 * Run the void setHostname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetHostname_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		String hostname = "";

		fixture.setHostname(hostname);

		// add additional test code here
	}

	/**
	 * Run the void setHttpPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetHttpPort_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		int httpPort = 1;

		fixture.setHttpPort(httpPort);

		// add additional test code here
	}

	/**
	 * Run the void setHttpsPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetHttpsPort_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		int httpsPort = 1;

		fixture.setHttpsPort(httpsPort);

		// add additional test code here
	}

	/**
	 * Run the void setInstanceNr(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetInstanceNr_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		int instanceNr = 1;

		fixture.setInstanceNr(instanceNr);

		// add additional test code here
	}

	/**
	 * Run the void setStartPriority(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetStartPriority_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", 1, 1, 1, "", "", STATECOLOR.fromString(""));
		String startPriority = "";

		fixture.setStartPriority(startPriority);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SAPInstanceTest.class);
	}
}