package com.sap.managementconsole.soap.axis.sapcontrol;

import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ICMProxyConnectionTest</code> contains tests for the class <code>{@link ICMProxyConnection}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ICMProxyConnectionTest {
	/**
	 * Run the ICMProxyConnection() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testICMProxyConnection_1()
		throws Exception {

		ICMProxyConnection result = new ICMProxyConnection();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMProxyConnection : Unsupported major.minor version 51.0
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
	 * Run the ICMProxyConnection(String,String,String,int,String,int,String,int,int,String,String,String,Integer,String,String,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testICMProxyConnection_2()
		throws Exception {
		String conid = "";
		String role = "";
		String peerAddress = "";
		int peerPort = 1;
		String localAddress = "";
		int localPort = 1;
		String status = "";
		int nihdl = 1;
		int socket = 1;
		String partner = "";
		String internalConvid = "";
		String externalConvid = "";
		Integer sncContextLength = new Integer(1);
		String failoverStatus = "";
		String disconnectTime = "";
		String objectid = "";
		String tidUidMode = "";

		ICMProxyConnection result = new ICMProxyConnection(conid, role, peerAddress, peerPort, localAddress, localPort, status, nihdl, socket, partner, internalConvid, externalConvid, sncContextLength, failoverStatus, disconnectTime, objectid, tidUidMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/ICMProxyConnection : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetConid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getConid();

		// add additional test code here
		assertNotNull(result);
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

		Deserializer result = ICMProxyConnection.getDeserializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDisconnectTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetDisconnectTime_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getDisconnectTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getExternalConvid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetExternalConvid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getExternalConvid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getFailoverStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetFailoverStatus_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getFailoverStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getInternalConvid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetInternalConvid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getInternalConvid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLocalAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLocalAddress_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getLocalAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getLocalPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetLocalPort_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		int result = fixture.getLocalPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getNihdl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetNihdl_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		int result = fixture.getNihdl();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getObjectid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetObjectid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getObjectid();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPartner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPartner_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getPartner();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPeerAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPeerAddress_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getPeerAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getPeerPort() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetPeerPort_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		int result = fixture.getPeerPort();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getRole() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getRole();

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

		Serializer result = ICMProxyConnection.getSerializer(mechType, _javaType, _xmlType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Integer getSncContextLength() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSncContextLength_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		Integer result = fixture.getSncContextLength();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getSocket() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetSocket_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		int result = fixture.getSocket();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getTidUidMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetTidUidMode_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");

		String result = fixture.getTidUidMode();

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

		TypeDesc result = ICMProxyConnection.getTypeDesc();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setConid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetConid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String conid = "";

		fixture.setConid(conid);

		// add additional test code here
	}

	/**
	 * Run the void setDisconnectTime(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDisconnectTime_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String disconnectTime = "";

		fixture.setDisconnectTime(disconnectTime);

		// add additional test code here
	}

	/**
	 * Run the void setExternalConvid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetExternalConvid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String externalConvid = "";

		fixture.setExternalConvid(externalConvid);

		// add additional test code here
	}

	/**
	 * Run the void setFailoverStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetFailoverStatus_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String failoverStatus = "";

		fixture.setFailoverStatus(failoverStatus);

		// add additional test code here
	}

	/**
	 * Run the void setInternalConvid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetInternalConvid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String internalConvid = "";

		fixture.setInternalConvid(internalConvid);

		// add additional test code here
	}

	/**
	 * Run the void setLocalAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetLocalAddress_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String localAddress = "";

		fixture.setLocalAddress(localAddress);

		// add additional test code here
	}

	/**
	 * Run the void setLocalPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetLocalPort_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		int localPort = 1;

		fixture.setLocalPort(localPort);

		// add additional test code here
	}

	/**
	 * Run the void setNihdl(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetNihdl_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		int nihdl = 1;

		fixture.setNihdl(nihdl);

		// add additional test code here
	}

	/**
	 * Run the void setObjectid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetObjectid_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String objectid = "";

		fixture.setObjectid(objectid);

		// add additional test code here
	}

	/**
	 * Run the void setPartner(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetPartner_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String partner = "";

		fixture.setPartner(partner);

		// add additional test code here
	}

	/**
	 * Run the void setPeerAddress(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetPeerAddress_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String peerAddress = "";

		fixture.setPeerAddress(peerAddress);

		// add additional test code here
	}

	/**
	 * Run the void setPeerPort(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetPeerPort_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		int peerPort = 1;

		fixture.setPeerPort(peerPort);

		// add additional test code here
	}

	/**
	 * Run the void setRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetRole_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String role = "";

		fixture.setRole(role);

		// add additional test code here
	}

	/**
	 * Run the void setSncContextLength(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetSncContextLength_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		Integer sncContextLength = new Integer(1);

		fixture.setSncContextLength(sncContextLength);

		// add additional test code here
	}

	/**
	 * Run the void setSocket(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetSocket_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		int socket = 1;

		fixture.setSocket(socket);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String status = "";

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setTidUidMode(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetTidUidMode_1()
		throws Exception {
		ICMProxyConnection fixture = new ICMProxyConnection("", "", "", 1, "", 1, "", 1, 1, "", "", "", new Integer(1), "", "", "", "");
		String tidUidMode = "";

		fixture.setTidUidMode(tidUidMode);

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
		new org.junit.runner.JUnitCore().run(ICMProxyConnectionTest.class);
	}
}