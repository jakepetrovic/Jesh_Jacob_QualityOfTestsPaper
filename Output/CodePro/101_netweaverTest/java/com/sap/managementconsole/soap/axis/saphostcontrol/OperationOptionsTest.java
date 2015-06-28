package com.sap.managementconsole.soap.axis.saphostcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>OperationOptionsTest</code> contains tests for the class <code>{@link OperationOptions}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:39 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class OperationOptionsTest {
	/**
	 * Run the OperationOptions() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testOperationOptions_1()
		throws Exception {

		OperationOptions result = new OperationOptions();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/OperationOptions : Unsupported major.minor version 51.0
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
	 * Run the OperationOptions(long,InstanceOptionsFlags[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testOperationOptions_2()
		throws Exception {
		long mTimeout = 1L;
		InstanceOptionsFlags[] mOptions = new InstanceOptionsFlags[] {};

		OperationOptions result = new OperationOptions(mTimeout, mOptions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/OperationOptions : Unsupported major.minor version 51.0
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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions();

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions();

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions();

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions();

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
	public void testEquals_7()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		Object obj = new OperationOptions();

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

		Deserializer result = OperationOptions.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceOptionsFlags[] getMOptions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetMOptions_1()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

		InstanceOptionsFlags[] result = fixture.getMOptions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getMTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testGetMTimeout_1()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

		long result = fixture.getMTimeout();

		// add additional test code here
		assertEquals(0L, result);
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

		Serializer result = OperationOptions.getSerializer(mechType, _javaType, _xmlType);

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

		TypeDesc result = OperationOptions.getTypeDesc();

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	public void testHashCode_4()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	public void testHashCode_5()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testHashCode_6()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_7()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_8()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

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
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_9()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setMOptions(InstanceOptionsFlags[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetMOptions_1()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		InstanceOptionsFlags[] mOptions = new InstanceOptionsFlags[] {};

		fixture.setMOptions(mOptions);

		// add additional test code here
	}

	/**
	 * Run the void setMTimeout(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:39 AM
	 */
	@Test
	public void testSetMTimeout_1()
		throws Exception {
		OperationOptions fixture = new OperationOptions(1L, new InstanceOptionsFlags[] {});
		long mTimeout = 1L;

		fixture.setMTimeout(mTimeout);

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
		new org.junit.runner.JUnitCore().run(OperationOptionsTest.class);
	}
}