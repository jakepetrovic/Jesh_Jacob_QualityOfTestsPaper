package com.sap.managementconsole.soap.axis.saphostcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SAPInstanceTest</code> contains tests for the class <code>{@link SAPInstance}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:15 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAPInstanceTest {
	/**
	 * Run the SAPInstance() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSAPInstance_1()
		throws Exception {

		SAPInstance result = new SAPInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPInstance : Unsupported major.minor version 51.0
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
	 * Run the SAPInstance(String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSAPInstance_2()
		throws Exception {
		String mSid = "";
		String mHostname = "";
		String mSystemNumber = "";
		String mSapVersionInfo = "";

		SAPInstance result = new SAPInstance(mSid, mHostname, mSystemNumber, mSapVersionInfo);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPInstance : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
		Object obj = new SAPInstance("", "", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		SAPInstance fixture = new SAPInstance((String) null, (String) null, (String) null, (String) null);
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
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
	 * Run the String getMHostname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetMHostname_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");

		String result = fixture.getMHostname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMSapVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetMSapVersionInfo_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");

		String result = fixture.getMSapVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMSid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetMSid_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");

		String result = fixture.getMSid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMSystemNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testGetMSystemNumber_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");

		String result = fixture.getMSystemNumber();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
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
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
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
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		SAPInstance fixture = new SAPInstance((String) null, "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setMHostname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSetMHostname_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
		String mHostname = "";

		fixture.setMHostname(mHostname);

		// add additional test code here
	}

	/**
	 * Run the void setMSapVersionInfo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSetMSapVersionInfo_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
		String mSapVersionInfo = "";

		fixture.setMSapVersionInfo(mSapVersionInfo);

		// add additional test code here
	}

	/**
	 * Run the void setMSid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSetMSid_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
		String mSid = "";

		fixture.setMSid(mSid);

		// add additional test code here
	}

	/**
	 * Run the void setMSystemNumber(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:15 AM
	 */
	@Test
	public void testSetMSystemNumber_1()
		throws Exception {
		SAPInstance fixture = new SAPInstance("", "", "", "");
		String mSystemNumber = "";

		fixture.setMSystemNumber(mSystemNumber);

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
		new org.junit.runner.JUnitCore().run(SAPInstanceTest.class);
	}
}