package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ProfileParameterTest</code> contains tests for the class <code>{@link ProfileParameter}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:46 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ProfileParameterTest {
	/**
	 * Run the ProfileParameter() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testProfileParameter_1()
		throws Exception {

		ProfileParameter result = new ProfileParameter();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ProfileParameter : Unsupported major.minor version 51.0
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
	 * Run the ProfileParameter(String,String,String,String,ParameterRestriction,SubProfileParameter[],String,String,String[],String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testProfileParameter_2()
		throws Exception {
		String name = "";
		String group = "";
		String description = "";
		String unit = "";
		ParameterRestriction restriction = new ParameterRestriction();
		SubProfileParameter[] subPara = new SubProfileParameter[] {};
		String value = "";
		String dynamicValue = "";
		String[] values = new String[] {};
		String[] dynamicValues = new String[] {};

		ProfileParameter result = new ProfileParameter(name, group, description, unit, restriction, subPara, value, dynamicValue, values, dynamicValues);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ProfileParameter : Unsupported major.minor version 51.0
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
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = ProfileParameter.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDynamicValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetDynamicValue_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getDynamicValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getDynamicValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetDynamicValues_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String[] result = fixture.getDynamicValues();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getGroup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetGroup_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getGroup();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ParameterRestriction getRestriction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetRestriction_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		ParameterRestriction result = fixture.getRestriction();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = ProfileParameter.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SubProfileParameter[] getSubPara() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetSubPara_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		SubProfileParameter[] result = fixture.getSubPara();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = ProfileParameter.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUnit() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetUnit_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getUnit();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getValues() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testGetValues_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});

		String[] result = fixture.getValues();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setDynamicValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetDynamicValue_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String dynamicValue = "";

		fixture.setDynamicValue(dynamicValue);

		// add additional test code here
	}

	/**
	 * Run the void setDynamicValues(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetDynamicValues_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String[] dynamicValues = new String[] {};

		fixture.setDynamicValues(dynamicValues);

		// add additional test code here
	}

	/**
	 * Run the void setGroup(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetGroup_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String group = "";

		fixture.setGroup(group);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRestriction(ParameterRestriction) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetRestriction_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		ParameterRestriction restriction = new ParameterRestriction();

		fixture.setRestriction(restriction);

		// add additional test code here
	}

	/**
	 * Run the void setSubPara(SubProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetSubPara_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		SubProfileParameter[] subPara = new SubProfileParameter[] {};

		fixture.setSubPara(subPara);

		// add additional test code here
	}

	/**
	 * Run the void setUnit(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetUnit_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String unit = "";

		fixture.setUnit(unit);

		// add additional test code here
	}

	/**
	 * Run the void setValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String value = "";

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Run the void setValues(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	@Test
	public void testSetValues_1()
		throws Exception {
		ProfileParameter fixture = new ProfileParameter("", "", "", "", new ParameterRestriction(), new SubProfileParameter[] {}, "", "", new String[] {}, new String[] {});
		String[] values = new String[] {};

		fixture.setValues(values);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
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
	 * @generatedBy CodePro at 4/8/14 10:46 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProfileParameterTest.class);
	}
}