package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SyslogEntryTest</code> contains tests for the class <code>{@link SyslogEntry}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:09 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SyslogEntryTest {
	/**
	 * Run the SyslogEntry() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSyslogEntry_1()
		throws Exception {

		SyslogEntry result = new SyslogEntry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SyslogEntry : Unsupported major.minor version 51.0
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
	 * Run the SyslogEntry(String,String,String,String,String,String,String,STATECOLOR) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSyslogEntry_2()
		throws Exception {
		String time = "";
		String typ = "";
		String client = "";
		String user = "";
		String tcode = "";
		String MNo = "";
		String text = "";
		STATECOLOR severity = STATECOLOR.fromString("");

		SyslogEntry result = new SyslogEntry(time, typ, client, user, tcode, MNo, text, severity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SyslogEntry : Unsupported major.minor version 51.0
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
	 * Run the String getClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetClient_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getClient();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = SyslogEntry.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getMNo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetMNo_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getMNo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = SyslogEntry.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the STATECOLOR getSeverity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetSeverity_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		STATECOLOR result = fixture.getSeverity();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTcode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetTcode_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getTcode();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getText();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTyp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetTyp_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getTyp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = SyslogEntry.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		String result = fixture.getUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry((String) null, (String) null, (String) null, "", "", "", "", STATECOLOR.fromString(""));

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", (String) null, (String) null, (String) null, (String) null, (STATECOLOR) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setClient(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetClient_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String client = "";

		fixture.setClient(client);

		// add additional test code here
	}

	/**
	 * Run the void setMNo(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetMNo_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String MNo = "";

		fixture.setMNo(MNo);

		// add additional test code here
	}

	/**
	 * Run the void setSeverity(STATECOLOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetSeverity_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		STATECOLOR severity = STATECOLOR.fromString("");

		fixture.setSeverity(severity);

		// add additional test code here
	}

	/**
	 * Run the void setTcode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetTcode_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String tcode = "";

		fixture.setTcode(tcode);

		// add additional test code here
	}

	/**
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String text = "";

		fixture.setText(text);

		// add additional test code here
	}

	/**
	 * Run the void setTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetTime_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String time = "";

		fixture.setTime(time);

		// add additional test code here
	}

	/**
	 * Run the void setTyp(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetTyp_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String typ = "";

		fixture.setTyp(typ);

		// add additional test code here
	}

	/**
	 * Run the void setUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	@Test
	public void testSetUser_1()
		throws Exception {
		SyslogEntry fixture = new SyslogEntry("", "", "", "", "", "", "", STATECOLOR.fromString(""));
		String user = "";

		fixture.setUser(user);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:09 AM
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
	 * @generatedBy CodePro at 4/8/14 11:09 AM
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
	 * @generatedBy CodePro at 4/8/14 11:09 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SyslogEntryTest.class);
	}
}