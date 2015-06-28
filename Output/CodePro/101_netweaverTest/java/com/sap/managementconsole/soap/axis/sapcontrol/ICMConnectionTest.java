package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ICMConnectionTest</code> contains tests for the class <code>{@link ICMConnection}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:43 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ICMConnectionTest {
	/**
	 * Run the ICMConnection() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testICMConnection_1()
		throws Exception {

		ICMConnection result = new ICMConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMConnection : Unsupported major.minor version 51.0
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
	 * Run the ICMConnection(String,String,String,String,String,int,String,int,int,int,String,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testICMConnection_2()
		throws Exception {
		String conid = "";
		String protocol = "";
		String role = "";
		String requesttype = "";
		String peerAddress = "";
		int peerPort = 1;
		String localAddress = "";
		int localPort = 1;
		int procTimeout = 1;
		int keepaliveTimeout = 1;
		String connectionTime = "";
		int nihdl = 1;

		ICMConnection result = new ICMConnection(conid, protocol, role, requesttype, peerAddress, peerPort, localAddress, localPort, procTimeout, keepaliveTimeout, connectionTime, nihdl);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMConnection : Unsupported major.minor version 51.0
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
	 * Run the String getConid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetConid_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getConid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getConnectionTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetConnectionTime_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getConnectionTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Deserializer getDeserializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetDeserializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Deserializer result = ICMConnection.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getKeepaliveTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetKeepaliveTimeout_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.getKeepaliveTimeout();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getLocalAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetLocalAddress_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getLocalAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getLocalPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetLocalPort_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.getLocalPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNihdl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetNihdl_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.getNihdl();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getPeerAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetPeerAddress_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getPeerAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPeerPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetPeerPort_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.getPeerPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getProcTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetProcTimeout_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.getProcTimeout();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getProtocol() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetProtocol_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getProtocol();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequesttype() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetRequesttype_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getRequesttype();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		String result = fixture.getRole();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializer getSerializer(String,Class,QName) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetSerializer_1()
		throws Exception {
		String mechType = "";
		Class _javaType = Object.class;
		QName _xmlType = new QName("");

		Serializer result = ICMConnection.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TypeDesc getTypeDesc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testGetTypeDesc_1()
		throws Exception {

		TypeDesc result = ICMConnection.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		ICMConnection fixture = new ICMConnection((String) null, (String) null, (String) null, "", "", 1, "", 1, 1, 1, "", 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testHashCode_3()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", (String) null, (String) null, 1, (String) null, 1, 1, 1, (String) null, 1);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setConid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetConid_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String conid = "";

		fixture.setConid(conid);

		// add additional test code here
	}

	/**
	 * Run the void setConnectionTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetConnectionTime_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String connectionTime = "";

		fixture.setConnectionTime(connectionTime);

		// add additional test code here
	}

	/**
	 * Run the void setKeepaliveTimeout(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetKeepaliveTimeout_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		int keepaliveTimeout = 1;

		fixture.setKeepaliveTimeout(keepaliveTimeout);

		// add additional test code here
	}

	/**
	 * Run the void setLocalAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetLocalAddress_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String localAddress = "";

		fixture.setLocalAddress(localAddress);

		// add additional test code here
	}

	/**
	 * Run the void setLocalPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetLocalPort_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		int localPort = 1;

		fixture.setLocalPort(localPort);

		// add additional test code here
	}

	/**
	 * Run the void setNihdl(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetNihdl_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		int nihdl = 1;

		fixture.setNihdl(nihdl);

		// add additional test code here
	}

	/**
	 * Run the void setPeerAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetPeerAddress_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String peerAddress = "";

		fixture.setPeerAddress(peerAddress);

		// add additional test code here
	}

	/**
	 * Run the void setPeerPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetPeerPort_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		int peerPort = 1;

		fixture.setPeerPort(peerPort);

		// add additional test code here
	}

	/**
	 * Run the void setProcTimeout(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetProcTimeout_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		int procTimeout = 1;

		fixture.setProcTimeout(procTimeout);

		// add additional test code here
	}

	/**
	 * Run the void setProtocol(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetProtocol_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String protocol = "";

		fixture.setProtocol(protocol);

		// add additional test code here
	}

	/**
	 * Run the void setRequesttype(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetRequesttype_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String requesttype = "";

		fixture.setRequesttype(requesttype);

		// add additional test code here
	}

	/**
	 * Run the void setRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	@Test
	public void testSetRole_1()
		throws Exception {
		ICMConnection fixture = new ICMConnection("", "", "", "", "", 1, "", 1, 1, 1, "", 1);
		String role = "";

		fixture.setRole(role);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:43 AM
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
	 * @generatedBy CodePro at 4/8/14 10:43 AM
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
	 * @generatedBy CodePro at 4/8/14 10:43 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ICMConnectionTest.class);
	}
}