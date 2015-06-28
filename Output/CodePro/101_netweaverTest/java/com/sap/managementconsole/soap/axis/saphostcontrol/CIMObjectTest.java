package com.sap.managementconsole.soap.axis.saphostcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CIMObjectTest</code> contains tests for the class <code>{@link CIMObject}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:33 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CIMObjectTest {
	/**
	 * Run the CIMObject() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testCIMObject_1()
		throws Exception {

		CIMObject result = new CIMObject();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/CIMObject : Unsupported major.minor version 51.0
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
	 * Run the CIMObject(CIMAttribute[],CIMObject[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testCIMObject_2()
		throws Exception {
		CIMAttribute[] mProperties = new CIMAttribute[] {};
		CIMObject[] mMembers = new CIMObject[] {};

		CIMObject result = new CIMObject(mProperties, mMembers);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/CIMObject : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
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
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		Object obj = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		Object obj = new CIMObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		Object obj = new CIMObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		Object obj = new CIMObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		Object obj = new CIMObject();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = CIMObject.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getMMembers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testGetMMembers_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		CIMObject[] result = fixture.getMMembers();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMAttribute[] getMProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testGetMProperties_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		CIMAttribute[] result = fixture.getMProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = CIMObject.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = CIMObject.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testHashCode_4()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testHashCode_5()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testHashCode_6()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testHashCode_7()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_8()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_9()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_10()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_11()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_12()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_13()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setMMembers(CIMObject[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testSetMMembers_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		CIMObject[] mMembers = new CIMObject[] {};

		fixture.setMMembers(mMembers);

		// add additional test code here
	}

	/**
	 * Run the void setMProperties(CIMAttribute[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	@Test
	public void testSetMProperties_1()
		throws Exception {
		CIMObject fixture = new CIMObject(new CIMAttribute[] {}, new CIMObject[] {});
		CIMAttribute[] mProperties = new CIMAttribute[] {};

		fixture.setMProperties(mProperties);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:33 AM
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
	 * @generatedBy CodePro at 4/8/14 11:33 AM
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
	 * @generatedBy CodePro at 4/8/14 11:33 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CIMObjectTest.class);
	}
}