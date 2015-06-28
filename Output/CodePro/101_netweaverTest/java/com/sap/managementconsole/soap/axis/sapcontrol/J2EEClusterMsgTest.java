package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>J2EEClusterMsgTest</code> contains tests for the class <code>{@link J2EEClusterMsg}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:38 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class J2EEClusterMsgTest {
	/**
	 * Run the J2EEClusterMsg() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testJ2EEClusterMsg_1()
		throws Exception {

		J2EEClusterMsg result = new J2EEClusterMsg();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEClusterMsg : Unsupported major.minor version 51.0
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
	 * Run the J2EEClusterMsg(String,String,long,long,long,long,long,long,long,long,long) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testJ2EEClusterMsg_2()
		throws Exception {
		String service = "";
		String id = "";
		long count = 1L;
		long length = 1L;
		long avgLength = 1L;
		long maxLength = 1L;
		long countP2PMsg = 1L;
		long countP2PRequest = 1L;
		long countP2PReply = 1L;
		long countBroadcastMsg = 1L;
		long countBroadcastRequest = 1L;

		J2EEClusterMsg result = new J2EEClusterMsg(service, id, count, length, avgLength, maxLength, countP2PMsg, countP2PRequest, countP2PReply, countBroadcastMsg, countBroadcastRequest);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/J2EEClusterMsg : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
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
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		Object obj = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		Object obj = new J2EEClusterMsg();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		Object obj = new J2EEClusterMsg();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		Object obj = new J2EEClusterMsg();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg((String) null, (String) null, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		Object obj = new J2EEClusterMsg();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the long getAvgLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetAvgLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getAvgLength();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCount_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCount();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCountBroadcastMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCountBroadcastMsg_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCountBroadcastMsg();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCountBroadcastRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCountBroadcastRequest_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCountBroadcastRequest();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCountP2PMsg() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCountP2PMsg_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCountP2PMsg();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCountP2PReply() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCountP2PReply_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCountP2PReply();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getCountP2PRequest() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetCountP2PRequest_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getCountP2PRequest();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = J2EEClusterMsg.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getLength();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMaxLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetMaxLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		long result = fixture.getMaxLength();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = J2EEClusterMsg.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetService_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		String result = fixture.getService();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = J2EEClusterMsg.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg((String) null, (String) null, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAvgLength(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetAvgLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long avgLength = 1L;

		fixture.setAvgLength(avgLength);

		// add additional test code here
	}

	/**
	 * Run the void setCount(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCount_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long count = 1L;

		fixture.setCount(count);

		// add additional test code here
	}

	/**
	 * Run the void setCountBroadcastMsg(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCountBroadcastMsg_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long countBroadcastMsg = 1L;

		fixture.setCountBroadcastMsg(countBroadcastMsg);

		// add additional test code here
	}

	/**
	 * Run the void setCountBroadcastRequest(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCountBroadcastRequest_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long countBroadcastRequest = 1L;

		fixture.setCountBroadcastRequest(countBroadcastRequest);

		// add additional test code here
	}

	/**
	 * Run the void setCountP2PMsg(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCountP2PMsg_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long countP2PMsg = 1L;

		fixture.setCountP2PMsg(countP2PMsg);

		// add additional test code here
	}

	/**
	 * Run the void setCountP2PReply(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCountP2PReply_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long countP2PReply = 1L;

		fixture.setCountP2PReply(countP2PReply);

		// add additional test code here
	}

	/**
	 * Run the void setCountP2PRequest(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetCountP2PRequest_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long countP2PRequest = 1L;

		fixture.setCountP2PRequest(countP2PRequest);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setLength(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long length = 1L;

		fixture.setLength(length);

		// add additional test code here
	}

	/**
	 * Run the void setMaxLength(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetMaxLength_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		long maxLength = 1L;

		fixture.setMaxLength(maxLength);

		// add additional test code here
	}

	/**
	 * Run the void setService(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	@Test
	public void testSetService_1()
		throws Exception {
		J2EEClusterMsg fixture = new J2EEClusterMsg("", "", 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
		String service = "";

		fixture.setService(service);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:38 AM
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
	 * @generatedBy CodePro at 4/8/14 11:38 AM
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
	 * @generatedBy CodePro at 4/8/14 11:38 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(J2EEClusterMsgTest.class);
	}
}