package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ICMThreadTest</code> contains tests for the class <code>{@link ICMThread}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:28 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ICMThreadTest {
	/**
	 * Run the ICMThread() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testICMThread_1()
		throws Exception {

		ICMThread result = new ICMThread();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMThread : Unsupported major.minor version 51.0
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
	 * Run the ICMThread(String,String,long,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testICMThread_2()
		throws Exception {
		String name = "";
		String id = "";
		long requests = 1L;
		String status = "";
		String requesttype = "";

		ICMThread result = new ICMThread(name, id, requests, status, requesttype);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMThread : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
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
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread("", "", 1L, "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		ICMThread fixture = new ICMThread((String) null, (String) null, 1L, (String) null, (String) null);
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		Object obj = new ICMThread();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = ICMThread.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getRequests() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetRequests_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		long result = fixture.getRequests();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getRequesttype() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetRequesttype_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		String result = fixture.getRequesttype();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = ICMThread.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		String result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = ICMThread.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ICMThread fixture = new ICMThread((String) null, "", 1L, "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		ICMThread fixture = new ICMThread("", (String) null, 1L, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRequests(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testSetRequests_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		long requests = 1L;

		fixture.setRequests(requests);

		// add additional test code here
	}

	/**
	 * Run the void setRequesttype(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testSetRequesttype_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		String requesttype = "";

		fixture.setRequesttype(requesttype);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		ICMThread fixture = new ICMThread("", "", 1L, "", "");
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:28 AM
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
	 * @generatedBy CodePro at 4/8/14 11:28 AM
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
	 * @generatedBy CodePro at 4/8/14 11:28 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ICMThreadTest.class);
	}
}