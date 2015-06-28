package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AlertNodeTest</code> contains tests for the class <code>{@link AlertNode}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:54 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AlertNodeTest {
	/**
	 * Run the AlertNode() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testAlertNode_1()
		throws Exception {

		AlertNode result = new AlertNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/AlertNode : Unsupported major.minor version 51.0
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
	 * Run the AlertNode(String,int,STATECOLOR,String,String,String,VISIBLELEVEL,STATECOLOR,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testAlertNode_2()
		throws Exception {
		String name = "";
		int parent = 1;
		STATECOLOR actualValue = STATECOLOR.fromString("");
		String description = "";
		String time = "";
		String analyseTool = "";
		VISIBLELEVEL visibleLevel = VISIBLELEVEL.fromString("");
		STATECOLOR highAlertValue = STATECOLOR.fromString("");
		String alDescription = "";
		String alTime = "";
		String tid = "";

		AlertNode result = new AlertNode(name, parent, actualValue, description, time, analyseTool, visibleLevel, highAlertValue, alDescription, alTime, tid);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/AlertNode : Unsupported major.minor version 51.0
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
	 * Run the STATECOLOR getActualValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetActualValue_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		STATECOLOR result = fixture.getActualValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAlDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetAlDescription_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getAlDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAlTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetAlTime_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getAlTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAnalyseTool() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetAnalyseTool_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getAnalyseTool();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = AlertNode.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getHighAlertValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetHighAlertValue_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		STATECOLOR result = fixture.getHighAlertValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		int result = fixture.getParent();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = AlertNode.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetTid_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getTid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		String result = fixture.getTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = AlertNode.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the VISIBLELEVEL getVisibleLevel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testGetVisibleLevel_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		VISIBLELEVEL result = fixture.getVisibleLevel();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		AlertNode fixture = new AlertNode((String) null, 1, (STATECOLOR) null, (String) null, (String) null, "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", (String) null, (VISIBLELEVEL) null, (STATECOLOR) null, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setActualValue(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetActualValue_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		STATECOLOR actualValue = STATECOLOR.fromString("");

		fixture.setActualValue(actualValue);

		// add additional test code here
	}

	/**
	 * Run the void setAlDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetAlDescription_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String alDescription = "";

		fixture.setAlDescription(alDescription);

		// add additional test code here
	}

	/**
	 * Run the void setAlTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetAlTime_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String alTime = "";

		fixture.setAlTime(alTime);

		// add additional test code here
	}

	/**
	 * Run the void setAnalyseTool(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetAnalyseTool_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String analyseTool = "";

		fixture.setAnalyseTool(analyseTool);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setHighAlertValue(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetHighAlertValue_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		STATECOLOR highAlertValue = STATECOLOR.fromString("");

		fixture.setHighAlertValue(highAlertValue);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setParent(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		int parent = 1;

		fixture.setParent(parent);

		// add additional test code here
	}

	/**
	 * Run the void setTid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetTid_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String tid = "";

		fixture.setTid(tid);

		// add additional test code here
	}

	/**
	 * Run the void setTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetTime_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		String time = "";

		fixture.setTime(time);

		// add additional test code here
	}

	/**
	 * Run the void setVisibleLevel(VISIBLELEVEL) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	@Test
	public void testSetVisibleLevel_1()
		throws Exception {
		AlertNode fixture = new AlertNode("", 1, STATECOLOR.fromString(""), "", "", "", VISIBLELEVEL.fromString(""), STATECOLOR.fromString(""), "", "", "");
		VISIBLELEVEL visibleLevel = VISIBLELEVEL.fromString("");

		fixture.setVisibleLevel(visibleLevel);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:54 AM
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
	 * @generatedBy CodePro at 4/8/14 10:54 AM
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
	 * @generatedBy CodePro at 4/8/14 10:54 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AlertNodeTest.class);
	}
}