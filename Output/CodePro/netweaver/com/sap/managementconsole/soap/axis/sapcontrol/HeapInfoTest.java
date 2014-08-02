package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HeapInfoTest</code> contains tests for the class <code>{@link HeapInfo}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:44 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class HeapInfoTest {
	/**
	 * Run the HeapInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testHeapInfo_1()
		throws Exception {

		HeapInfo result = new HeapInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/HeapInfo : Unsupported major.minor version 51.0
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
	 * Run the HeapInfo(String,String,long,long,long,long,long,STATECOLOR) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testHeapInfo_2()
		throws Exception {
		String processname = "";
		String type = "";
		long size = 1L;
		long commitSize = 1L;
		long maxUsedSize = 1L;
		long initialSize = 1L;
		long maxSize = 1L;
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		HeapInfo result = new HeapInfo(processname, type, size, commitSize, maxUsedSize, initialSize, maxSize, dispstatus);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/HeapInfo : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
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
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		HeapInfo fixture = new HeapInfo((String) null, (String) null, 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		Object obj = new HeapInfo();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the long getCommitSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetCommitSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		long result = fixture.getCommitSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = HeapInfo.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getDispstatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetDispstatus_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		STATECOLOR result = fixture.getDispstatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getInitialSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetInitialSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		long result = fixture.getInitialSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMaxSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetMaxSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		long result = fixture.getMaxSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMaxUsedSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetMaxUsedSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		long result = fixture.getMaxUsedSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getProcessname() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetProcessname_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		String result = fixture.getProcessname();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = HeapInfo.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		long result = fixture.getSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		String result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = HeapInfo.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		HeapInfo fixture = new HeapInfo((String) null, "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", (String) null, 1L, 1L, 1L, 1L, 1L, (STATECOLOR) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setCommitSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetCommitSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		long commitSize = 1L;

		fixture.setCommitSize(commitSize);

		// add additional test code here
	}

	/**
	 * Run the void setDispstatus(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetDispstatus_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		STATECOLOR dispstatus = STATECOLOR.fromString("");

		fixture.setDispstatus(dispstatus);

		// add additional test code here
	}

	/**
	 * Run the void setInitialSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetInitialSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		long initialSize = 1L;

		fixture.setInitialSize(initialSize);

		// add additional test code here
	}

	/**
	 * Run the void setMaxSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetMaxSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		long maxSize = 1L;

		fixture.setMaxSize(maxSize);

		// add additional test code here
	}

	/**
	 * Run the void setMaxUsedSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetMaxUsedSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		long maxUsedSize = 1L;

		fixture.setMaxUsedSize(maxUsedSize);

		// add additional test code here
	}

	/**
	 * Run the void setProcessname(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetProcessname_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		String processname = "";

		fixture.setProcessname(processname);

		// add additional test code here
	}

	/**
	 * Run the void setSize(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		long size = 1L;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		HeapInfo fixture = new HeapInfo("", "", 1L, 1L, 1L, 1L, 1L, STATECOLOR.fromString(""));
		String type = "";

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:44 AM
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
	 * @generatedBy CodePro at 4/8/14 10:44 AM
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
	 * @generatedBy CodePro at 4/8/14 10:44 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HeapInfoTest.class);
	}
}