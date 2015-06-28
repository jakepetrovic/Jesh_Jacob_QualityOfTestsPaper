package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AlertTest</code> contains tests for the class <code>{@link Alert}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:42 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AlertTest {
	/**
	 * Run the Alert() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testAlert_1()
		throws Exception {

		Alert result = new Alert();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/Alert : Unsupported major.minor version 51.0
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
	 * Run the Alert(String,String,STATECOLOR,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testAlert_2()
		throws Exception {
		String object = "";
		String attribute = "";
		STATECOLOR value = STATECOLOR.fromString("");
		String description = "";
		String time = "";
		String tid = "";
		String aid = "";

		Alert result = new Alert(object, attribute, value, description, time, tid, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetAid_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getAid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getAttribute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getDescription();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = Alert.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetObject_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getObject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = Alert.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetTid_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getTid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		String result = fixture.getTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = Alert.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		STATECOLOR result = fixture.getValue();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Alert fixture = new Alert((String) null, (String) null, (STATECOLOR) null, "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), (String) null, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetAid_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String aid = "";

		fixture.setAid(aid);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String attribute = "";

		fixture.setAttribute(attribute);

		// add additional test code here
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String description = "";

		fixture.setDescription(description);

		// add additional test code here
	}

	/**
	 * Run the void setObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetObject_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String object = "";

		fixture.setObject(object);

		// add additional test code here
	}

	/**
	 * Run the void setTid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetTid_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String tid = "";

		fixture.setTid(tid);

		// add additional test code here
	}

	/**
	 * Run the void setTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetTime_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		String time = "";

		fixture.setTime(time);

		// add additional test code here
	}

	/**
	 * Run the void setValue(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	@Test
	public void testSetValue_1()
		throws Exception {
		Alert fixture = new Alert("", "", STATECOLOR.fromString(""), "", "", "", "");
		STATECOLOR value = STATECOLOR.fromString("");

		fixture.setValue(value);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:42 AM
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
	 * @generatedBy CodePro at 4/8/14 11:42 AM
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
	 * @generatedBy CodePro at 4/8/14 11:42 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AlertTest.class);
	}
}