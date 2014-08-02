package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EEWebSessionTest</code> contains tests for the class <code>{@link J2EEWebSession}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:47 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EEWebSessionTest {
	/**
	 * Run the J2EEWebSession() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testJ2EEWebSession_1()
		throws Exception {

		J2EEWebSession result = new J2EEWebSession();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEWebSession : Unsupported major.minor version 51.0
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
	 * Run the J2EEWebSession(String,int,int,int,int,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testJ2EEWebSession_2()
		throws Exception {
		String processname = "";
		int idHash = 1;
		int size = 1;
		int timeout = 1;
		int activeRequests = 1;
		String startTime = "";
		String updateTime = "";
		String state = "";
		String backingStore = "";
		String user = "";

		J2EEWebSession result = new J2EEWebSession(processname, idHash, size, timeout, activeRequests, startTime, updateTime, state, backingStore, user);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEWebSession : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		Object obj = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		Object obj = new J2EEWebSession();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		Object obj = new J2EEWebSession();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession((String) null, 1, 1, 1, 1, (String) null, (String) null, (String) null, (String) null, (String) null);
		Object obj = new J2EEWebSession();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the int getActiveRequests() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetActiveRequests_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		int result = fixture.getActiveRequests();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getBackingStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetBackingStore_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getBackingStore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EEWebSession.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getIdHash() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetIdHash_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		int result = fixture.getIdHash();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EEWebSession.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		int result = fixture.getSize();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getStartTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetStartTime_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getStartTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getState() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getState();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetTimeout_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		int result = fixture.getTimeout();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EEWebSession.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUpdateTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetUpdateTime_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getUpdateTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession((String) null, 1, 1, 1, 1, (String) null, "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", (String) null, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setActiveRequests(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetActiveRequests_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		int activeRequests = 1;

		fixture.setActiveRequests(activeRequests);

		// add additional test code here
	}

	/**
	 * Run the void setBackingStore(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetBackingStore_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String backingStore = "";

		fixture.setBackingStore(backingStore);

		// add additional test code here
	}

	/**
	 * Run the void setIdHash(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetIdHash_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		int idHash = 1;

		fixture.setIdHash(idHash);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setSize(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		int size = 1;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setStartTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetStartTime_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String startTime = "";

		fixture.setStartTime(startTime);

		// add additional test code here
	}

	/**
	 * Run the void setState(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetState_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String state = "";

		fixture.setState(state);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetTimeout_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		int timeout = 1;

		fixture.setTimeout(timeout);

		// add additional test code here
	}

	/**
	 * Run the void setUpdateTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetUpdateTime_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String updateTime = "";

		fixture.setUpdateTime(updateTime);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		J2EEWebSession fixture = new J2EEWebSession("", 1, 1, 1, 1, "", "", "", "", "");
		String user = "";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:47 AM
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
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
	 * @generatedBy CodePro at 4/8/14 10:47 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EEWebSessionTest.class);
	}
}