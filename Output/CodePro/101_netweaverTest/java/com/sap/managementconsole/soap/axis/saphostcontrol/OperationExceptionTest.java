package com.sap.managementconsole.soap.axis.saphostcontrol;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OperationExceptionTest</code> contains tests for the class <code>{@link OperationException}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:52 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OperationExceptionTest {
	/**
	 * Run the OperationException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testOperationException_1()
		throws Exception {

		OperationException result = new OperationException();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/OperationException : Unsupported major.minor version 51.0
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
	 * Run the OperationException(long,String,String,ResponseMessage[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testOperationException_2()
		throws Exception {
		long mFaultCode = 1L;
		String mMessage = "";
		String mOperationID = "";
		ResponseMessage[] mResponseMessages = new ResponseMessage[] {};

		OperationException result = new OperationException(mFaultCode, mMessage, mOperationID, mResponseMessages);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/OperationException : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
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
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		OperationException obj = new OperationException(1L, "", "", new ResponseMessage[] {});
		obj.addSuppressed(new Throwable());
		obj.detail = new Throwable();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/OperationException : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		OperationException fixture = new OperationException(1L, (String) null, (String) null, new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testEquals_9()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		Object obj = new OperationException();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = OperationException.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getMFaultCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetMFaultCode_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		long result = fixture.getMFaultCode();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getMMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetMMessage_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		String result = fixture.getMMessage();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMOperationID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetMOperationID_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		String result = fixture.getMOperationID();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ResponseMessage[] getMResponseMessages() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetMResponseMessages_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		ResponseMessage[] result = fixture.getMResponseMessages();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = OperationException.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = OperationException.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		OperationException fixture = new OperationException(1L, (String) null, (String) null, new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		OperationException fixture = new OperationException(1L, (String) null, (String) null, new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testHashCode_4()
		throws Exception {
		OperationException fixture = new OperationException(1L, (String) null, (String) null, new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testHashCode_5()
		throws Exception {
		OperationException fixture = new OperationException(1L, (String) null, (String) null, new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testHashCode_6()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_7()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_8()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_9()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setMFaultCode(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testSetMFaultCode_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		long mFaultCode = 1L;

		fixture.setMFaultCode(mFaultCode);

		// add additional test code here
	}

	/**
	 * Run the void setMMessage(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testSetMMessage_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		String mMessage = "";

		fixture.setMMessage(mMessage);

		// add additional test code here
	}

	/**
	 * Run the void setMOperationID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testSetMOperationID_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		String mOperationID = "";

		fixture.setMOperationID(mOperationID);

		// add additional test code here
	}

	/**
	 * Run the void setMResponseMessages(ResponseMessage[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testSetMResponseMessages_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		ResponseMessage[] mResponseMessages = new ResponseMessage[] {};

		fixture.setMResponseMessages(mResponseMessages);

		// add additional test code here
	}

	/**
	 * Run the void writeDetails(QName,SerializationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test
	public void testWriteDetails_1()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		QName qname = new QName("");
		SerializationContext context = new SerializationContext(new CharArrayWriter());

		fixture.writeDetails(qname, context);

		// add additional test code here
	}

	/**
	 * Run the void writeDetails(QName,SerializationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWriteDetails_2()
		throws Exception {
		OperationException fixture = new OperationException(1L, "", "", new ResponseMessage[] {});
		fixture.addSuppressed(new Throwable());
		fixture.detail = new Throwable();
		QName qname = new QName("");
		SerializationContext context = new SerializationContext(new CharArrayWriter());

		fixture.writeDetails(qname, context);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:52 AM
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
	 * @generatedBy CodePro at 4/8/14 10:52 AM
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
	 * @generatedBy CodePro at 4/8/14 10:52 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(OperationExceptionTest.class);
	}
}