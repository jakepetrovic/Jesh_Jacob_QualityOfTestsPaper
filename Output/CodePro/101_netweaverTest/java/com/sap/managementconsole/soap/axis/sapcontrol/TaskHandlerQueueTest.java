package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TaskHandlerQueueTest</code> contains tests for the class <code>{@link TaskHandlerQueue}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:40 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TaskHandlerQueueTest {
	/**
	 * Run the TaskHandlerQueue() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testTaskHandlerQueue_1()
		throws Exception {

		TaskHandlerQueue result = new TaskHandlerQueue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/TaskHandlerQueue : Unsupported major.minor version 51.0
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
	 * Run the TaskHandlerQueue(String,int,int,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testTaskHandlerQueue_2()
		throws Exception {
		String typ = "";
		int now = 1;
		int high = 1;
		int max = 1;
		int writes = 1;
		int reads = 1;

		TaskHandlerQueue result = new TaskHandlerQueue(typ, now, high, max, writes, reads);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/TaskHandlerQueue : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue((String) null, 1, 1, 1, 1, 1);
		Object obj = new TaskHandlerQueue();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = TaskHandlerQueue.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getHigh() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetHigh_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.getHigh();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetMax_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.getMax();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetNow_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.getNow();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getReads() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetReads_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.getReads();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = TaskHandlerQueue.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTyp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetTyp_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		String result = fixture.getTyp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = TaskHandlerQueue.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getWrites() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testGetWrites_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.getWrites();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue((String) null, 1, 1, 1, 1, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setHigh(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetHigh_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		int high = 1;

		fixture.setHigh(high);

		// add additional test code here
	}

	/**
	 * Run the void setMax(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetMax_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		int max = 1;

		fixture.setMax(max);

		// add additional test code here
	}

	/**
	 * Run the void setNow(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetNow_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		int now = 1;

		fixture.setNow(now);

		// add additional test code here
	}

	/**
	 * Run the void setReads(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetReads_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		int reads = 1;

		fixture.setReads(reads);

		// add additional test code here
	}

	/**
	 * Run the void setTyp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetTyp_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		String typ = "";

		fixture.setTyp(typ);

		// add additional test code here
	}

	/**
	 * Run the void setWrites(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	@Test
	public void testSetWrites_1()
		throws Exception {
		TaskHandlerQueue fixture = new TaskHandlerQueue("", 1, 1, 1, 1, 1);
		int writes = 1;

		fixture.setWrites(writes);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
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
	 * @generatedBy CodePro at 4/8/14 10:40 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TaskHandlerQueueTest.class);
	}
}