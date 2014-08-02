package com.sap.engine.services.dc.wsgate;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ApplicationTest</code> contains tests for the class <code>{@link Application}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:41 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ApplicationTest {
	/**
	 * Run the Application() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testApplication_1()
		throws Exception {

		Application result = new Application();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/Application : Unsupported major.minor version 51.0
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
	 * Run the Application(String,String,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testApplication_2()
		throws Exception {
		String id = "";
		String location = "";
		String name = "";
		String status = "";
		String vendor = "";
		String version = "";

		Application result = new Application(id, location, name, status, vendor, version);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/engine/services/dc/wsgate/Application : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
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
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		Object obj = new Application("", "", "", "", "", "");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		Object obj = new Application();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		Object obj = new Application();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Application fixture = new Application((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
		Object obj = new Application();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		Object obj = new Application();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = Application.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = Application.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = Application.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetVendor_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getVendor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		Application fixture = new Application((String) null, (String) null, "", "", "", "");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		Application fixture = new Application("", "", (String) null, (String) null, (String) null, (String) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String location = "";

		fixture.setLocation(location);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setVendor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetVendor_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String vendor = "";

		fixture.setVendor(vendor);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		Application fixture = new Application("", "", "", "", "", "");
		String version = "";

		fixture.setVersion(version);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:41 AM
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
	 * @generatedBy CodePro at 4/8/14 10:41 AM
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
	 * @generatedBy CodePro at 4/8/14 10:41 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ApplicationTest.class);
	}
}