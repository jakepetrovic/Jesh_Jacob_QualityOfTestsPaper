package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ParameterRestrictionTest</code> contains tests for the class <code>{@link ParameterRestriction}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ParameterRestrictionTest {
	/**
	 * Run the ParameterRestriction() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testParameterRestriction_1()
		throws Exception {

		ParameterRestriction result = new ParameterRestriction();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ParameterRestriction : Unsupported major.minor version 51.0
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
	 * Run the ParameterRestriction(RESTRICTIONTYPE,Long,Long,Double,Double,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testParameterRestriction_2()
		throws Exception {
		RESTRICTIONTYPE type = RESTRICTIONTYPE.fromString("");
		Long intMin = new Long(1L);
		Long intMax = new Long(1L);
		Double floatMin = new Double(1.0);
		Double floatMax = new Double(1.0);
		String[] valuemap = new String[] {};

		ParameterRestriction result = new ParameterRestriction(type, intMin, intMax, floatMin, floatMax, valuemap);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ParameterRestriction : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Object obj = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Object obj = new ParameterRestriction();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Object obj = new ParameterRestriction();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction((RESTRICTIONTYPE) null, (Long) null, (Long) null, (Double) null, (Double) null, new String[] {});
		Object obj = new ParameterRestriction();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = ParameterRestriction.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Double getFloatMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetFloatMax_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		Double result = fixture.getFloatMax();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Double getFloatMin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetFloatMin_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		Double result = fixture.getFloatMin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Long getIntMax() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetIntMax_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		Long result = fixture.getIntMax();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Long getIntMin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetIntMin_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		Long result = fixture.getIntMin();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = ParameterRestriction.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the RESTRICTIONTYPE getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		RESTRICTIONTYPE result = fixture.getType();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = ParameterRestriction.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getValuemap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetValuemap_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		String[] result = fixture.getValuemap();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction((RESTRICTIONTYPE) null, (Long) null, (Long) null, new Double(1.0), new Double(1.0), new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction((RESTRICTIONTYPE) null, (Long) null, (Long) null, (Double) null, (Double) null, new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_4()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction((RESTRICTIONTYPE) null, (Long) null, (Long) null, (Double) null, (Double) null, new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testHashCode_5()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction((RESTRICTIONTYPE) null, (Long) null, (Long) null, (Double) null, (Double) null, new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.ArrayIndexOutOfBoundsException.class)
	public void testHashCode_6()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_7()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_8()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHashCode_9()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), (Double) null, (Double) null, new String[] {});

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setFloatMax(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetFloatMax_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Double floatMax = new Double(1.0);

		fixture.setFloatMax(floatMax);

		// add additional test code here
	}

	/**
	 * Run the void setFloatMin(Double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetFloatMin_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Double floatMin = new Double(1.0);

		fixture.setFloatMin(floatMin);

		// add additional test code here
	}

	/**
	 * Run the void setIntMax(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetIntMax_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Long intMax = new Long(1L);

		fixture.setIntMax(intMax);

		// add additional test code here
	}

	/**
	 * Run the void setIntMin(Long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetIntMin_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		Long intMin = new Long(1L);

		fixture.setIntMin(intMin);

		// add additional test code here
	}

	/**
	 * Run the void setType(RESTRICTIONTYPE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		RESTRICTIONTYPE type = RESTRICTIONTYPE.fromString("");

		fixture.setType(type);

		// add additional test code here
	}

	/**
	 * Run the void setValuemap(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetValuemap_1()
		throws Exception {
		ParameterRestriction fixture = new ParameterRestriction(RESTRICTIONTYPE.fromString(""), new Long(1L), new Long(1L), new Double(1.0), new Double(1.0), new String[] {});
		String[] valuemap = new String[] {};

		fixture.setValuemap(valuemap);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ParameterRestrictionTest.class);
	}
}