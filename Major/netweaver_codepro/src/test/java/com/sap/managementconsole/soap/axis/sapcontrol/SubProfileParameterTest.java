package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SubProfileParameterTest</code> contains tests for the class <code>{@link SubProfileParameter}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:27 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SubProfileParameterTest {
	/**
	 * Run the SubProfileParameter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSubProfileParameter_1()
		throws Exception {

		SubProfileParameter result = new SubProfileParameter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SubProfileParameter : Unsupported major.minor version 51.0
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
	 * Run the SubProfileParameter(String,String,String,boolean,ParameterRestriction) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSubProfileParameter_2()
		throws Exception {
		String name = "";
		String description = "";
		String unit = "";
		boolean mandatory = true;
		ParameterRestriction restriction = new ParameterRestriction();

		SubProfileParameter result = new SubProfileParameter(name, description, unit, mandatory, restriction);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SubProfileParameter : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
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
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testEquals_8()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter((String) null, (String) null, (String) null, true, new ParameterRestriction());
		Object obj = new SubProfileParameter();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		String result = fixture.getDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = SubProfileParameter.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ParameterRestriction getRestriction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetRestriction_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		ParameterRestriction result = fixture.getRestriction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = SubProfileParameter.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = SubProfileParameter.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		String result = fixture.getUnit();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter((String) null, "", "", false, new ParameterRestriction());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", (String) null, (String) null, true, (ParameterRestriction) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isMandatory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testIsMandatory_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());

		boolean result = fixture.isMandatory();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isMandatory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testIsMandatory_2()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", false, new ParameterRestriction());

		boolean result = fixture.isMandatory();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setMandatory(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSetMandatory_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		boolean mandatory = true;

		fixture.setMandatory(mandatory);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRestriction(ParameterRestriction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSetRestriction_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		ParameterRestriction restriction = new ParameterRestriction();

		fixture.setRestriction(restriction);

		// add additional test code here
	}

	/**
	 * Run the void setUnit(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	@Test
	public void testSetUnit_1()
		throws Exception {
		SubProfileParameter fixture = new SubProfileParameter("", "", "", true, new ParameterRestriction());
		String unit = "";

		fixture.setUnit(unit);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:27 AM
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
	 * @generatedBy CodePro at 4/8/14 11:27 AM
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
	 * @generatedBy CodePro at 4/8/14 11:27 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SubProfileParameterTest.class);
	}
}