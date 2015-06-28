package com.sap.managementconsole.soap.axis.sapcontrol;

import java.net.URL;
import java.rmi.RemoteException;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.DeployWSServiceLocator;
import com.sap.managementconsole.soap.axis.sapcontrol.holders.ArrayOfAlertHolder;
import com.sap.managementconsole.soap.axis.sapcontrol.holders.ArrayOfStringHolder;
import com.sap.managementconsole.soap.axis.sapcontrol.holders.STATECOLORHolder;

/**
 * The class <code>SAPControl_BindingStubTest</code> contains tests for the class <code>{@link SAPControl_BindingStub}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:07 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAPControl_BindingStubTest {
	/**
	 * Run the SAPControl_BindingStub() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSAPControl_BindingStub_1()
		throws Exception {

		SAPControl_BindingStub result = new SAPControl_BindingStub();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPControl_BindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSAPControl_BindingStub_2()
		throws Exception {
		javax.xml.rpc.Service service = new Service();

		SAPControl_BindingStub result = new SAPControl_BindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPControl_BindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSAPControl_BindingStub_3()
		throws Exception {
		javax.xml.rpc.Service service = null;

		SAPControl_BindingStub result = new SAPControl_BindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPControl_BindingStub(URL,Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSAPControl_BindingStub_4()
		throws Exception {
		URL endpointURL = new URL("");
		javax.xml.rpc.Service service = new DeployWSServiceLocator();

		SAPControl_BindingStub result = new SAPControl_BindingStub(endpointURL, service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/sapcontrol/SAPControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the int[] ABAPAcknowledgeAlerts(String,String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testABAPAcknowledgeAlerts_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String r3Client = "";
		String r3User = "";
		String r3Password = "";
		String[] aid = new String[] {};

		int[] result = fixture.ABAPAcknowledgeAlerts(r3Client, r3User, r3Password, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int[] ABAPAcknowledgeAlerts(String,String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testABAPAcknowledgeAlerts_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String r3Client = "";
		String r3User = "";
		String r3Password = "";
		String[] aid = new String[] {};

		int[] result = fixture.ABAPAcknowledgeAlerts(r3Client, r3User, r3Password, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int[] ABAPAcknowledgeAlerts(String,String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPAcknowledgeAlerts_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String r3Client = "";
		String r3User = "";
		String r3Password = "";
		String[] aid = new String[] {};

		int[] result = fixture.ABAPAcknowledgeAlerts(r3Client, r3User, r3Password, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int[] ABAPAcknowledgeAlerts(String,String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPAcknowledgeAlerts_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String r3Client = "";
		String r3User = "";
		String r3Password = "";
		String[] aid = new String[] {};

		int[] result = fixture.ABAPAcknowledgeAlerts(r3Client, r3User, r3Password, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int[] ABAPAcknowledgeAlerts(String,String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testABAPAcknowledgeAlerts_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String r3Client = "";
		String r3User = "";
		String r3Password = "";
		String[] aid = new String[] {};

		int[] result = fixture.ABAPAcknowledgeAlerts(r3Client, r3User, r3Password, aid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorkProcess[] ABAPGetWPTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testABAPGetWPTable_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		WorkProcess[] result = fixture.ABAPGetWPTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorkProcess[] ABAPGetWPTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testABAPGetWPTable_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		WorkProcess[] result = fixture.ABAPGetWPTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorkProcess[] ABAPGetWPTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPGetWPTable_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		WorkProcess[] result = fixture.ABAPGetWPTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorkProcess[] ABAPGetWPTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPGetWPTable_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		WorkProcess[] result = fixture.ABAPGetWPTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the WorkProcess[] ABAPGetWPTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testABAPGetWPTable_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		WorkProcess[] result = fixture.ABAPGetWPTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] ABAPReadRawSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testABAPReadRawSyslog_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.ABAPReadRawSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] ABAPReadRawSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testABAPReadRawSyslog_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.ABAPReadRawSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] ABAPReadRawSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPReadRawSyslog_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.ABAPReadRawSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] ABAPReadRawSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPReadRawSyslog_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.ABAPReadRawSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] ABAPReadRawSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testABAPReadRawSyslog_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		String[] result = fixture.ABAPReadRawSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SyslogEntry[] ABAPReadSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testABAPReadSyslog_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SyslogEntry[] result = fixture.ABAPReadSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SyslogEntry[] ABAPReadSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testABAPReadSyslog_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SyslogEntry[] result = fixture.ABAPReadSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SyslogEntry[] ABAPReadSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPReadSyslog_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SyslogEntry[] result = fixture.ABAPReadSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SyslogEntry[] ABAPReadSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testABAPReadSyslog_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SyslogEntry[] result = fixture.ABAPReadSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SyslogEntry[] ABAPReadSyslog() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testABAPReadSyslog_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		SyslogEntry[] result = fixture.ABAPReadSyslog();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMCacheEntry[] ICMGetCacheEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testICMGetCacheEntries_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMCacheEntry[] result = fixture.ICMGetCacheEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMCacheEntry[] ICMGetCacheEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testICMGetCacheEntries_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMCacheEntry[] result = fixture.ICMGetCacheEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMCacheEntry[] ICMGetCacheEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetCacheEntries_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMCacheEntry[] result = fixture.ICMGetCacheEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMCacheEntry[] ICMGetCacheEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetCacheEntries_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMCacheEntry[] result = fixture.ICMGetCacheEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMCacheEntry[] ICMGetCacheEntries() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testICMGetCacheEntries_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		ICMCacheEntry[] result = fixture.ICMGetCacheEntries();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMConnection[] ICMGetConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testICMGetConnectionList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMConnection[] result = fixture.ICMGetConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMConnection[] ICMGetConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testICMGetConnectionList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMConnection[] result = fixture.ICMGetConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMConnection[] ICMGetConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetConnectionList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMConnection[] result = fixture.ICMGetConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMConnection[] ICMGetConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetConnectionList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMConnection[] result = fixture.ICMGetConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMConnection[] ICMGetConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testICMGetConnectionList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		ICMConnection[] result = fixture.ICMGetConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMProxyConnection[] ICMGetProxyConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testICMGetProxyConnectionList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMProxyConnection[] result = fixture.ICMGetProxyConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMProxyConnection[] ICMGetProxyConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testICMGetProxyConnectionList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMProxyConnection[] result = fixture.ICMGetProxyConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMProxyConnection[] ICMGetProxyConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetProxyConnectionList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMProxyConnection[] result = fixture.ICMGetProxyConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMProxyConnection[] ICMGetProxyConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetProxyConnectionList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMProxyConnection[] result = fixture.ICMGetProxyConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMProxyConnection[] ICMGetProxyConnectionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testICMGetProxyConnectionList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		ICMProxyConnection[] result = fixture.ICMGetProxyConnectionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMThread[] ICMGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testICMGetThreadList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMThread[] result = fixture.ICMGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMThread[] ICMGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testICMGetThreadList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMThread[] result = fixture.ICMGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMThread[] ICMGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetThreadList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMThread[] result = fixture.ICMGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMThread[] ICMGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testICMGetThreadList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		ICMThread[] result = fixture.ICMGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ICMThread[] ICMGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testICMGetThreadList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		ICMThread[] result = fixture.ICMGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void OSExecute(String,int,int,String,IntHolder,IntHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testOSExecute_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String command = "";
		int async = 1;
		int timeout = 1;
		String protocolfile = "";
		IntHolder exitcode = new IntHolder();
		exitcode.value = 1;
		IntHolder pid = new IntHolder();
		pid.value = 1;
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.OSExecute(command, async, timeout, protocolfile, exitcode, pid, lines);

		// add additional test code here
	}

	/**
	 * Run the void OSExecute(String,int,int,String,IntHolder,IntHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testOSExecute_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String command = "";
		int async = 1;
		int timeout = 1;
		String protocolfile = "";
		IntHolder exitcode = new IntHolder();
		IntHolder pid = new IntHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.OSExecute(command, async, timeout, protocolfile, exitcode, pid, lines);

		// add additional test code here
	}

	/**
	 * Run the void OSExecute(String,int,int,String,IntHolder,IntHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testOSExecute_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String command = "";
		int async = 1;
		int timeout = 1;
		String protocolfile = "";
		IntHolder exitcode = new IntHolder();
		IntHolder pid = new IntHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.OSExecute(command, async, timeout, protocolfile, exitcode, pid, lines);

		// add additional test code here
	}

	/**
	 * Run the void OSExecute(String,int,int,String,IntHolder,IntHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testOSExecute_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String command = "";
		int async = 1;
		int timeout = 1;
		String protocolfile = "";
		IntHolder exitcode = new IntHolder();
		IntHolder pid = new IntHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.OSExecute(command, async, timeout, protocolfile, exitcode, pid, lines);

		// add additional test code here
	}

	/**
	 * Run the void OSExecute(String,int,int,String,IntHolder,IntHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testOSExecute_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String command = "";
		int async = 1;
		int timeout = 1;
		String protocolfile = "";
		IntHolder exitcode = new IntHolder();
		IntHolder pid = new IntHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.OSExecute(command, async, timeout, protocolfile, exitcode, pid, lines);

		// add additional test code here
	}

	/**
	 * Run the void accessCheck(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testAccessCheck_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String function = "";

		fixture.accessCheck(function);

		// add additional test code here
	}

	/**
	 * Run the void accessCheck(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAccessCheck_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String function = "";

		fixture.accessCheck(function);

		// add additional test code here
	}

	/**
	 * Run the void accessCheck(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAccessCheck_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String function = "";

		fixture.accessCheck(function);

		// add additional test code here
	}

	/**
	 * Run the void accessCheck(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAccessCheck_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String function = "";

		fixture.accessCheck(function);

		// add additional test code here
	}

	/**
	 * Run the void accessCheck(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testAccessCheck_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String function = "";

		fixture.accessCheck(function);

		// add additional test code here
	}

	/**
	 * Run the void analyseLogFiles(String,String,int,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testAnalyseLogFiles_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String starttime = "";
		String endtime = "";
		int severityLevel = 1;
		int maxentries = 1;
		StringHolder format = new StringHolder();
		format.value = "";
		ArrayOfStringHolder fields = new ArrayOfStringHolder(new String[] {});

		fixture.analyseLogFiles(starttime, endtime, severityLevel, maxentries, format, fields);

		// add additional test code here
	}

	/**
	 * Run the void analyseLogFiles(String,String,int,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAnalyseLogFiles_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String starttime = "";
		String endtime = "";
		int severityLevel = 1;
		int maxentries = 1;
		StringHolder format = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.analyseLogFiles(starttime, endtime, severityLevel, maxentries, format, fields);

		// add additional test code here
	}

	/**
	 * Run the void analyseLogFiles(String,String,int,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAnalyseLogFiles_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String starttime = "";
		String endtime = "";
		int severityLevel = 1;
		int maxentries = 1;
		StringHolder format = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.analyseLogFiles(starttime, endtime, severityLevel, maxentries, format, fields);

		// add additional test code here
	}

	/**
	 * Run the void analyseLogFiles(String,String,int,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAnalyseLogFiles_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String starttime = "";
		String endtime = "";
		int severityLevel = 1;
		int maxentries = 1;
		StringHolder format = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.analyseLogFiles(starttime, endtime, severityLevel, maxentries, format, fields);

		// add additional test code here
	}

	/**
	 * Run the void analyseLogFiles(String,String,int,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testAnalyseLogFiles_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String starttime = "";
		String endtime = "";
		int severityLevel = 1;
		int maxentries = 1;
		StringHolder format = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.analyseLogFiles(starttime, endtime, severityLevel, maxentries, format, fields);

		// add additional test code here
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testCreateCall_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testCreateCall_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testCreateCall_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testCreateCall_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testCreateCall_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnqLock[] enqGetLockTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testEnqGetLockTable_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		EnqLock[] result = fixture.enqGetLockTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnqLock[] enqGetLockTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testEnqGetLockTable_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		EnqLock[] result = fixture.enqGetLockTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnqLock[] enqGetLockTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqGetLockTable_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		EnqLock[] result = fixture.enqGetLockTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnqLock[] enqGetLockTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqGetLockTable_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		EnqLock[] result = fixture.enqGetLockTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the EnqLock[] enqGetLockTable() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testEnqGetLockTable_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		EnqLock[] result = fixture.enqGetLockTable();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void enqGetStatistic(IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,DoubleHolder,DoubleHolder,DoubleHolder,STATECOLORHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testEnqGetStatistic_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		IntHolder ownerNow = new IntHolder();
		ownerNow.value = 1;
		IntHolder ownerHigh = new IntHolder();
		ownerHigh.value = 1;
		IntHolder ownerMax = new IntHolder();
		ownerMax.value = 1;
		STATECOLORHolder ownerState = new STATECOLORHolder(STATECOLOR.fromString(""));
		IntHolder argumentsNow = new IntHolder();
		argumentsNow.value = 1;
		IntHolder argumentsHigh = new IntHolder();
		argumentsHigh.value = 1;
		IntHolder argumentsMax = new IntHolder();
		argumentsMax.value = 1;
		STATECOLORHolder argumentsState = new STATECOLORHolder(STATECOLOR.fromString(""));
		IntHolder locksNow = new IntHolder();
		locksNow.value = 1;
		IntHolder locksHigh = new IntHolder();
		locksHigh.value = 1;
		IntHolder locksMax = new IntHolder();
		locksMax.value = 1;
		STATECOLORHolder locksState = new STATECOLORHolder(STATECOLOR.fromString(""));
		LongHolder enqueueRequests = new LongHolder();
		enqueueRequests.value = 1L;
		LongHolder enqueueRejects = new LongHolder();
		enqueueRejects.value = 1L;
		LongHolder enqueueErrors = new LongHolder();
		enqueueErrors.value = 1L;
		LongHolder dequeueRequests = new LongHolder();
		dequeueRequests.value = 1L;
		LongHolder dequeueErrors = new LongHolder();
		dequeueErrors.value = 1L;
		LongHolder dequeueAllRequests = new LongHolder();
		dequeueAllRequests.value = 1L;
		LongHolder cleanupRequests = new LongHolder();
		cleanupRequests.value = 1L;
		LongHolder backupRequests = new LongHolder();
		backupRequests.value = 1L;
		LongHolder reportingRequests = new LongHolder();
		reportingRequests.value = 1L;
		LongHolder compressRequests = new LongHolder();
		compressRequests.value = 1L;
		LongHolder verifyRequests = new LongHolder();
		verifyRequests.value = 1L;
		DoubleHolder lockTime = new DoubleHolder();
		lockTime.value = 1.0;
		DoubleHolder lockWaitTime = new DoubleHolder();
		lockWaitTime.value = 1.0;
		DoubleHolder serverTime = new DoubleHolder();
		serverTime.value = 1.0;
		STATECOLORHolder replicationState = new STATECOLORHolder(STATECOLOR.fromString(""));

		fixture.enqGetStatistic(ownerNow, ownerHigh, ownerMax, ownerState, argumentsNow, argumentsHigh, argumentsMax, argumentsState, locksNow, locksHigh, locksMax, locksState, enqueueRequests, enqueueRejects, enqueueErrors, dequeueRequests, dequeueErrors, dequeueAllRequests, cleanupRequests, backupRequests, reportingRequests, compressRequests, verifyRequests, lockTime, lockWaitTime, serverTime, replicationState);

		// add additional test code here
	}

	/**
	 * Run the void enqGetStatistic(IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,DoubleHolder,DoubleHolder,DoubleHolder,STATECOLORHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testEnqGetStatistic_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		IntHolder ownerNow = new IntHolder();
		IntHolder ownerHigh = new IntHolder();
		IntHolder ownerMax = new IntHolder();
		STATECOLORHolder ownerState = new STATECOLORHolder();
		IntHolder argumentsNow = new IntHolder();
		IntHolder argumentsHigh = new IntHolder();
		IntHolder argumentsMax = new IntHolder();
		STATECOLORHolder argumentsState = new STATECOLORHolder();
		IntHolder locksNow = new IntHolder();
		IntHolder locksHigh = new IntHolder();
		IntHolder locksMax = new IntHolder();
		STATECOLORHolder locksState = new STATECOLORHolder();
		LongHolder enqueueRequests = new LongHolder();
		LongHolder enqueueRejects = new LongHolder();
		LongHolder enqueueErrors = new LongHolder();
		LongHolder dequeueRequests = new LongHolder();
		LongHolder dequeueErrors = new LongHolder();
		LongHolder dequeueAllRequests = new LongHolder();
		LongHolder cleanupRequests = new LongHolder();
		LongHolder backupRequests = new LongHolder();
		LongHolder reportingRequests = new LongHolder();
		LongHolder compressRequests = new LongHolder();
		LongHolder verifyRequests = new LongHolder();
		DoubleHolder lockTime = new DoubleHolder();
		DoubleHolder lockWaitTime = new DoubleHolder();
		DoubleHolder serverTime = new DoubleHolder();
		STATECOLORHolder replicationState = new STATECOLORHolder();

		fixture.enqGetStatistic(ownerNow, ownerHigh, ownerMax, ownerState, argumentsNow, argumentsHigh, argumentsMax, argumentsState, locksNow, locksHigh, locksMax, locksState, enqueueRequests, enqueueRejects, enqueueErrors, dequeueRequests, dequeueErrors, dequeueAllRequests, cleanupRequests, backupRequests, reportingRequests, compressRequests, verifyRequests, lockTime, lockWaitTime, serverTime, replicationState);

		// add additional test code here
	}

	/**
	 * Run the void enqGetStatistic(IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,DoubleHolder,DoubleHolder,DoubleHolder,STATECOLORHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqGetStatistic_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		IntHolder ownerNow = new IntHolder();
		IntHolder ownerHigh = new IntHolder();
		IntHolder ownerMax = new IntHolder();
		STATECOLORHolder ownerState = new STATECOLORHolder();
		IntHolder argumentsNow = new IntHolder();
		IntHolder argumentsHigh = new IntHolder();
		IntHolder argumentsMax = new IntHolder();
		STATECOLORHolder argumentsState = new STATECOLORHolder();
		IntHolder locksNow = new IntHolder();
		IntHolder locksHigh = new IntHolder();
		IntHolder locksMax = new IntHolder();
		STATECOLORHolder locksState = new STATECOLORHolder();
		LongHolder enqueueRequests = new LongHolder();
		LongHolder enqueueRejects = new LongHolder();
		LongHolder enqueueErrors = new LongHolder();
		LongHolder dequeueRequests = new LongHolder();
		LongHolder dequeueErrors = new LongHolder();
		LongHolder dequeueAllRequests = new LongHolder();
		LongHolder cleanupRequests = new LongHolder();
		LongHolder backupRequests = new LongHolder();
		LongHolder reportingRequests = new LongHolder();
		LongHolder compressRequests = new LongHolder();
		LongHolder verifyRequests = new LongHolder();
		DoubleHolder lockTime = new DoubleHolder();
		DoubleHolder lockWaitTime = new DoubleHolder();
		DoubleHolder serverTime = new DoubleHolder();
		STATECOLORHolder replicationState = new STATECOLORHolder();

		fixture.enqGetStatistic(ownerNow, ownerHigh, ownerMax, ownerState, argumentsNow, argumentsHigh, argumentsMax, argumentsState, locksNow, locksHigh, locksMax, locksState, enqueueRequests, enqueueRejects, enqueueErrors, dequeueRequests, dequeueErrors, dequeueAllRequests, cleanupRequests, backupRequests, reportingRequests, compressRequests, verifyRequests, lockTime, lockWaitTime, serverTime, replicationState);

		// add additional test code here
	}

	/**
	 * Run the void enqGetStatistic(IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,DoubleHolder,DoubleHolder,DoubleHolder,STATECOLORHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqGetStatistic_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		IntHolder ownerNow = new IntHolder();
		IntHolder ownerHigh = new IntHolder();
		IntHolder ownerMax = new IntHolder();
		STATECOLORHolder ownerState = new STATECOLORHolder();
		IntHolder argumentsNow = new IntHolder();
		IntHolder argumentsHigh = new IntHolder();
		IntHolder argumentsMax = new IntHolder();
		STATECOLORHolder argumentsState = new STATECOLORHolder();
		IntHolder locksNow = new IntHolder();
		IntHolder locksHigh = new IntHolder();
		IntHolder locksMax = new IntHolder();
		STATECOLORHolder locksState = new STATECOLORHolder();
		LongHolder enqueueRequests = new LongHolder();
		LongHolder enqueueRejects = new LongHolder();
		LongHolder enqueueErrors = new LongHolder();
		LongHolder dequeueRequests = new LongHolder();
		LongHolder dequeueErrors = new LongHolder();
		LongHolder dequeueAllRequests = new LongHolder();
		LongHolder cleanupRequests = new LongHolder();
		LongHolder backupRequests = new LongHolder();
		LongHolder reportingRequests = new LongHolder();
		LongHolder compressRequests = new LongHolder();
		LongHolder verifyRequests = new LongHolder();
		DoubleHolder lockTime = new DoubleHolder();
		DoubleHolder lockWaitTime = new DoubleHolder();
		DoubleHolder serverTime = new DoubleHolder();
		STATECOLORHolder replicationState = new STATECOLORHolder();

		fixture.enqGetStatistic(ownerNow, ownerHigh, ownerMax, ownerState, argumentsNow, argumentsHigh, argumentsMax, argumentsState, locksNow, locksHigh, locksMax, locksState, enqueueRequests, enqueueRejects, enqueueErrors, dequeueRequests, dequeueErrors, dequeueAllRequests, cleanupRequests, backupRequests, reportingRequests, compressRequests, verifyRequests, lockTime, lockWaitTime, serverTime, replicationState);

		// add additional test code here
	}

	/**
	 * Run the void enqGetStatistic(IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,IntHolder,IntHolder,IntHolder,STATECOLORHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,LongHolder,DoubleHolder,DoubleHolder,DoubleHolder,STATECOLORHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testEnqGetStatistic_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		IntHolder ownerNow = new IntHolder();
		IntHolder ownerHigh = new IntHolder();
		IntHolder ownerMax = new IntHolder();
		STATECOLORHolder ownerState = new STATECOLORHolder();
		IntHolder argumentsNow = new IntHolder();
		IntHolder argumentsHigh = new IntHolder();
		IntHolder argumentsMax = new IntHolder();
		STATECOLORHolder argumentsState = new STATECOLORHolder();
		IntHolder locksNow = new IntHolder();
		IntHolder locksHigh = new IntHolder();
		IntHolder locksMax = new IntHolder();
		STATECOLORHolder locksState = new STATECOLORHolder();
		LongHolder enqueueRequests = new LongHolder();
		LongHolder enqueueRejects = new LongHolder();
		LongHolder enqueueErrors = new LongHolder();
		LongHolder dequeueRequests = new LongHolder();
		LongHolder dequeueErrors = new LongHolder();
		LongHolder dequeueAllRequests = new LongHolder();
		LongHolder cleanupRequests = new LongHolder();
		LongHolder backupRequests = new LongHolder();
		LongHolder reportingRequests = new LongHolder();
		LongHolder compressRequests = new LongHolder();
		LongHolder verifyRequests = new LongHolder();
		DoubleHolder lockTime = new DoubleHolder();
		DoubleHolder lockWaitTime = new DoubleHolder();
		DoubleHolder serverTime = new DoubleHolder();
		STATECOLORHolder replicationState = new STATECOLORHolder();

		fixture.enqGetStatistic(ownerNow, ownerHigh, ownerMax, ownerState, argumentsNow, argumentsHigh, argumentsMax, argumentsState, locksNow, locksHigh, locksMax, locksState, enqueueRequests, enqueueRejects, enqueueErrors, dequeueRequests, dequeueErrors, dequeueAllRequests, cleanupRequests, backupRequests, reportingRequests, compressRequests, verifyRequests, lockTime, lockWaitTime, serverTime, replicationState);

		// add additional test code here
	}

	/**
	 * Run the void enqRemoveLocks(EnqLock[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testEnqRemoveLocks_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		EnqLock[] lock = new EnqLock[] {};

		fixture.enqRemoveLocks(lock);

		// add additional test code here
	}

	/**
	 * Run the void enqRemoveLocks(EnqLock[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testEnqRemoveLocks_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		EnqLock[] lock = new EnqLock[] {};

		fixture.enqRemoveLocks(lock);

		// add additional test code here
	}

	/**
	 * Run the void enqRemoveLocks(EnqLock[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqRemoveLocks_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		EnqLock[] lock = new EnqLock[] {};

		fixture.enqRemoveLocks(lock);

		// add additional test code here
	}

	/**
	 * Run the void enqRemoveLocks(EnqLock[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testEnqRemoveLocks_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		EnqLock[] lock = new EnqLock[] {};

		fixture.enqRemoveLocks(lock);

		// add additional test code here
	}

	/**
	 * Run the void enqRemoveLocks(EnqLock[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testEnqRemoveLocks_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		EnqLock[] lock = new EnqLock[] {};

		fixture.enqRemoveLocks(lock);

		// add additional test code here
	}

	/**
	 * Run the AccessPoint[] getAccessPointList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetAccessPointList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AccessPoint[] result = fixture.getAccessPointList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint[] getAccessPointList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAccessPointList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AccessPoint[] result = fixture.getAccessPointList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint[] getAccessPointList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAccessPointList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AccessPoint[] result = fixture.getAccessPointList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint[] getAccessPointList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAccessPointList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AccessPoint[] result = fixture.getAccessPointList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AccessPoint[] getAccessPointList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetAccessPointList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		AccessPoint[] result = fixture.getAccessPointList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AlertNode[] getAlertTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetAlertTree_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AlertNode[] result = fixture.getAlertTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AlertNode[] getAlertTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAlertTree_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AlertNode[] result = fixture.getAlertTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AlertNode[] getAlertTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAlertTree_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AlertNode[] result = fixture.getAlertTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AlertNode[] getAlertTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAlertTree_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		AlertNode[] result = fixture.getAlertTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AlertNode[] getAlertTree() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetAlertTree_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		AlertNode[] result = fixture.getAlertTree();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getAlerts(String,StringHolder,ArrayOfAlertHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetAlerts_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String rootTid = "";
		StringHolder rootTidName = new StringHolder();
		rootTidName.value = "";
		ArrayOfAlertHolder alert = new ArrayOfAlertHolder(new Alert[] {});

		fixture.getAlerts(rootTid, rootTidName, alert);

		// add additional test code here
	}

	/**
	 * Run the void getAlerts(String,StringHolder,ArrayOfAlertHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetAlerts_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String rootTid = "";
		StringHolder rootTidName = new StringHolder();
		ArrayOfAlertHolder alert = new ArrayOfAlertHolder();

		fixture.getAlerts(rootTid, rootTidName, alert);

		// add additional test code here
	}

	/**
	 * Run the void getAlerts(String,StringHolder,ArrayOfAlertHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAlerts_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String rootTid = "";
		StringHolder rootTidName = new StringHolder();
		ArrayOfAlertHolder alert = new ArrayOfAlertHolder();

		fixture.getAlerts(rootTid, rootTidName, alert);

		// add additional test code here
	}

	/**
	 * Run the void getAlerts(String,StringHolder,ArrayOfAlertHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetAlerts_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String rootTid = "";
		StringHolder rootTidName = new StringHolder();
		ArrayOfAlertHolder alert = new ArrayOfAlertHolder();

		fixture.getAlerts(rootTid, rootTidName, alert);

		// add additional test code here
	}

	/**
	 * Run the void getAlerts(String,StringHolder,ArrayOfAlertHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetAlerts_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String rootTid = "";
		StringHolder rootTidName = new StringHolder();
		ArrayOfAlertHolder alert = new ArrayOfAlertHolder();

		fixture.getAlerts(rootTid, rootTidName, alert);

		// add additional test code here
	}

	/**
	 * Run the String[] getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetEnvironment_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetEnvironment_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetEnvironment_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetEnvironment_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		String[] result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetEnvironment_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		String[] result = fixture.getEnvironment();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceProperty[] getInstanceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetInstanceProperties_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceProperty[] result = fixture.getInstanceProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceProperty[] getInstanceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetInstanceProperties_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceProperty[] result = fixture.getInstanceProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceProperty[] getInstanceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetInstanceProperties_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceProperty[] result = fixture.getInstanceProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceProperty[] getInstanceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetInstanceProperties_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceProperty[] result = fixture.getInstanceProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceProperty[] getInstanceProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetInstanceProperties_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		InstanceProperty[] result = fixture.getInstanceProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OSProcess[] getProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetProcessList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		OSProcess[] result = fixture.getProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OSProcess[] getProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetProcessList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		OSProcess[] result = fixture.getProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OSProcess[] getProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetProcessList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		OSProcess[] result = fixture.getProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OSProcess[] getProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetProcessList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		OSProcess[] result = fixture.getProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OSProcess[] getProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetProcessList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		OSProcess[] result = fixture.getProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ProfileParameter[] getProcessParameter(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetProcessParameter_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;

		ProfileParameter[] result = fixture.getProcessParameter(processtype, pid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ProfileParameter[] getProcessParameter(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetProcessParameter_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;

		ProfileParameter[] result = fixture.getProcessParameter(processtype, pid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ProfileParameter[] getProcessParameter(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetProcessParameter_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;

		ProfileParameter[] result = fixture.getProcessParameter(processtype, pid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ProfileParameter[] getProcessParameter(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetProcessParameter_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;

		ProfileParameter[] result = fixture.getProcessParameter(processtype, pid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ProfileParameter[] getProcessParameter(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetProcessParameter_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;

		ProfileParameter[] result = fixture.getProcessParameter(processtype, pid);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TaskHandlerQueue[] getQueueStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetQueueStatistic_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		TaskHandlerQueue[] result = fixture.getQueueStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TaskHandlerQueue[] getQueueStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetQueueStatistic_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		TaskHandlerQueue[] result = fixture.getQueueStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TaskHandlerQueue[] getQueueStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetQueueStatistic_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		TaskHandlerQueue[] result = fixture.getQueueStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TaskHandlerQueue[] getQueueStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetQueueStatistic_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		TaskHandlerQueue[] result = fixture.getQueueStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TaskHandlerQueue[] getQueueStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetQueueStatistic_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		TaskHandlerQueue[] result = fixture.getQueueStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getStartProfile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetStartProfile_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		name.value = "";
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.getStartProfile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getStartProfile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetStartProfile_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getStartProfile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getStartProfile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetStartProfile_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getStartProfile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getStartProfile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetStartProfile_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getStartProfile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getStartProfile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetStartProfile_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getStartProfile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the SAPInstance[] getSystemInstanceList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetSystemInstanceList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SAPInstance[] result = fixture.getSystemInstanceList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] getSystemInstanceList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetSystemInstanceList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SAPInstance[] result = fixture.getSystemInstanceList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] getSystemInstanceList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetSystemInstanceList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SAPInstance[] result = fixture.getSystemInstanceList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] getSystemInstanceList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetSystemInstanceList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		SAPInstance[] result = fixture.getSystemInstanceList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] getSystemInstanceList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetSystemInstanceList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		SAPInstance[] result = fixture.getSystemInstanceList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getTraceFile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetTraceFile_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		name.value = "";
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.getTraceFile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getTraceFile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetTraceFile_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getTraceFile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getTraceFile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetTraceFile_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getTraceFile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getTraceFile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetTraceFile_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getTraceFile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the void getTraceFile(StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetTraceFile_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.getTraceFile(name, lines);

		// add additional test code here
	}

	/**
	 * Run the InstanceVersionInfo[] getVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testGetVersionInfo_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceVersionInfo[] result = fixture.getVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceVersionInfo[] getVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetVersionInfo_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceVersionInfo[] result = fixture.getVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceVersionInfo[] getVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetVersionInfo_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceVersionInfo[] result = fixture.getVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceVersionInfo[] getVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetVersionInfo_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		InstanceVersionInfo[] result = fixture.getVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InstanceVersionInfo[] getVersionInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetVersionInfo_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		InstanceVersionInfo[] result = fixture.getVersionInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void j2EEControlProcess(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEControlProcess_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String function = "";

		fixture.j2EEControlProcess(processname, function);

		// add additional test code here
	}

	/**
	 * Run the void j2EEControlProcess(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEControlProcess_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String function = "";

		fixture.j2EEControlProcess(processname, function);

		// add additional test code here
	}

	/**
	 * Run the void j2EEControlProcess(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEControlProcess_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String function = "";

		fixture.j2EEControlProcess(processname, function);

		// add additional test code here
	}

	/**
	 * Run the void j2EEControlProcess(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEControlProcess_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String function = "";

		fixture.j2EEControlProcess(processname, function);

		// add additional test code here
	}

	/**
	 * Run the void j2EEControlProcess(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEControlProcess_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String processname = "";
		String function = "";

		fixture.j2EEControlProcess(processname, function);

		// add additional test code here
	}

	/**
	 * Run the void j2EEDisableDbgSession(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEDisableDbgSession_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String key = "";

		fixture.j2EEDisableDbgSession(key);

		// add additional test code here
	}

	/**
	 * Run the void j2EEDisableDbgSession(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEDisableDbgSession_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String key = "";

		fixture.j2EEDisableDbgSession(key);

		// add additional test code here
	}

	/**
	 * Run the void j2EEDisableDbgSession(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEDisableDbgSession_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String key = "";

		fixture.j2EEDisableDbgSession(key);

		// add additional test code here
	}

	/**
	 * Run the void j2EEDisableDbgSession(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEDisableDbgSession_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String key = "";

		fixture.j2EEDisableDbgSession(key);

		// add additional test code here
	}

	/**
	 * Run the void j2EEDisableDbgSession(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEDisableDbgSession_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String key = "";

		fixture.j2EEDisableDbgSession(key);

		// add additional test code here
	}

	/**
	 * Run the void j2EEEnableDbgSession(String,String,String,StringHolder,IntHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEEnableDbgSession_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String flags = "";
		String client = "";
		StringHolder key = new StringHolder();
		key.value = "";
		IntHolder port = new IntHolder();
		port.value = 1;

		fixture.j2EEEnableDbgSession(processname, flags, client, key, port);

		// add additional test code here
	}

	/**
	 * Run the void j2EEEnableDbgSession(String,String,String,StringHolder,IntHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEEnableDbgSession_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String flags = "";
		String client = "";
		StringHolder key = new StringHolder();
		IntHolder port = new IntHolder();

		fixture.j2EEEnableDbgSession(processname, flags, client, key, port);

		// add additional test code here
	}

	/**
	 * Run the void j2EEEnableDbgSession(String,String,String,StringHolder,IntHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEEnableDbgSession_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String flags = "";
		String client = "";
		StringHolder key = new StringHolder();
		IntHolder port = new IntHolder();

		fixture.j2EEEnableDbgSession(processname, flags, client, key, port);

		// add additional test code here
	}

	/**
	 * Run the void j2EEEnableDbgSession(String,String,String,StringHolder,IntHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEEnableDbgSession_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processname = "";
		String flags = "";
		String client = "";
		StringHolder key = new StringHolder();
		IntHolder port = new IntHolder();

		fixture.j2EEEnableDbgSession(processname, flags, client, key, port);

		// add additional test code here
	}

	/**
	 * Run the void j2EEEnableDbgSession(String,String,String,StringHolder,IntHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEEnableDbgSession_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String processname = "";
		String flags = "";
		String client = "";
		StringHolder key = new StringHolder();
		IntHolder port = new IntHolder();

		fixture.j2EEEnableDbgSession(processname, flags, client, key, port);

		// add additional test code here
	}

	/**
	 * Run the J2EEApplicationAlias[] j2EEGetApplicationAliasList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetApplicationAliasList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEApplicationAlias[] result = fixture.j2EEGetApplicationAliasList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEApplicationAlias[] j2EEGetApplicationAliasList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetApplicationAliasList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEApplicationAlias[] result = fixture.j2EEGetApplicationAliasList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEApplicationAlias[] j2EEGetApplicationAliasList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetApplicationAliasList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEApplicationAlias[] result = fixture.j2EEGetApplicationAliasList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEApplicationAlias[] j2EEGetApplicationAliasList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetApplicationAliasList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEApplicationAlias[] result = fixture.j2EEGetApplicationAliasList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEApplicationAlias[] j2EEGetApplicationAliasList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetApplicationAliasList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEApplicationAlias[] result = fixture.j2EEGetApplicationAliasList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache[] j2EEGetCacheStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetCacheStatistic_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache[] result = fixture.j2EEGetCacheStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache[] j2EEGetCacheStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetCacheStatistic_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache[] result = fixture.j2EEGetCacheStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache[] j2EEGetCacheStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetCacheStatistic_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache[] result = fixture.j2EEGetCacheStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache[] j2EEGetCacheStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetCacheStatistic_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache[] result = fixture.j2EEGetCacheStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache[] j2EEGetCacheStatistic() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetCacheStatistic_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EECache[] result = fixture.j2EEGetCacheStatistic();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache2[] j2EEGetCacheStatistic2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetCacheStatistic2_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache2[] result = fixture.j2EEGetCacheStatistic2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache2[] j2EEGetCacheStatistic2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetCacheStatistic2_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache2[] result = fixture.j2EEGetCacheStatistic2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache2[] j2EEGetCacheStatistic2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetCacheStatistic2_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache2[] result = fixture.j2EEGetCacheStatistic2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache2[] j2EEGetCacheStatistic2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetCacheStatistic2_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EECache2[] result = fixture.j2EEGetCacheStatistic2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EECache2[] j2EEGetCacheStatistic2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetCacheStatistic2_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EECache2[] result = fixture.j2EEGetCacheStatistic2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEClusterMsg[] j2EEGetClusterMsgList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetClusterMsgList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEClusterMsg[] result = fixture.j2EEGetClusterMsgList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEClusterMsg[] j2EEGetClusterMsgList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetClusterMsgList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEClusterMsg[] result = fixture.j2EEGetClusterMsgList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEClusterMsg[] j2EEGetClusterMsgList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetClusterMsgList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEClusterMsg[] result = fixture.j2EEGetClusterMsgList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEClusterMsg[] j2EEGetClusterMsgList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetClusterMsgList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEClusterMsg[] result = fixture.j2EEGetClusterMsgList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEClusterMsg[] j2EEGetClusterMsgList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetClusterMsgList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEClusterMsg[] result = fixture.j2EEGetClusterMsgList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEEJBSession[] j2EEGetEJBSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetEJBSessionList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEEJBSession[] result = fixture.j2EEGetEJBSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEEJBSession[] j2EEGetEJBSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetEJBSessionList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEEJBSession[] result = fixture.j2EEGetEJBSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEEJBSession[] j2EEGetEJBSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetEJBSessionList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEEJBSession[] result = fixture.j2EEGetEJBSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEEJBSession[] j2EEGetEJBSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetEJBSessionList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEEJBSession[] result = fixture.j2EEGetEJBSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEEJBSession[] j2EEGetEJBSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetEJBSessionList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEEJBSession[] result = fixture.j2EEGetEJBSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess[] j2EEGetProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetProcessList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess[] result = fixture.j2EEGetProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess[] j2EEGetProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetProcessList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess[] result = fixture.j2EEGetProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess[] j2EEGetProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetProcessList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess[] result = fixture.j2EEGetProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess[] j2EEGetProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetProcessList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess[] result = fixture.j2EEGetProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess[] j2EEGetProcessList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetProcessList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEProcess[] result = fixture.j2EEGetProcessList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess2[] j2EEGetProcessList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetProcessList2_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess2[] result = fixture.j2EEGetProcessList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess2[] j2EEGetProcessList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetProcessList2_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess2[] result = fixture.j2EEGetProcessList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess2[] j2EEGetProcessList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetProcessList2_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess2[] result = fixture.j2EEGetProcessList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess2[] j2EEGetProcessList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetProcessList2_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEProcess2[] result = fixture.j2EEGetProcessList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEProcess2[] j2EEGetProcessList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetProcessList2_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEProcess2[] result = fixture.j2EEGetProcessList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EERemoteObject[] j2EEGetRemoteObjectList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetRemoteObjectList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EERemoteObject[] result = fixture.j2EEGetRemoteObjectList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EERemoteObject[] j2EEGetRemoteObjectList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetRemoteObjectList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EERemoteObject[] result = fixture.j2EEGetRemoteObjectList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EERemoteObject[] j2EEGetRemoteObjectList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetRemoteObjectList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EERemoteObject[] result = fixture.j2EEGetRemoteObjectList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EERemoteObject[] j2EEGetRemoteObjectList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetRemoteObjectList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EERemoteObject[] result = fixture.j2EEGetRemoteObjectList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EERemoteObject[] j2EEGetRemoteObjectList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetRemoteObjectList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EERemoteObject[] result = fixture.j2EEGetRemoteObjectList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESession[] j2EEGetSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetSessionList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESession[] result = fixture.j2EEGetSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESession[] j2EEGetSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetSessionList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESession[] result = fixture.j2EEGetSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESession[] j2EEGetSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetSessionList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESession[] result = fixture.j2EEGetSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESession[] j2EEGetSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetSessionList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESession[] result = fixture.j2EEGetSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESession[] j2EEGetSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetSessionList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EESession[] result = fixture.j2EEGetSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESharedTableInfo[] j2EEGetSharedTableInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetSharedTableInfo_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESharedTableInfo[] result = fixture.j2EEGetSharedTableInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESharedTableInfo[] j2EEGetSharedTableInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetSharedTableInfo_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESharedTableInfo[] result = fixture.j2EEGetSharedTableInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESharedTableInfo[] j2EEGetSharedTableInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetSharedTableInfo_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESharedTableInfo[] result = fixture.j2EEGetSharedTableInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESharedTableInfo[] j2EEGetSharedTableInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetSharedTableInfo_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EESharedTableInfo[] result = fixture.j2EEGetSharedTableInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EESharedTableInfo[] j2EEGetSharedTableInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetSharedTableInfo_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EESharedTableInfo[] result = fixture.j2EEGetSharedTableInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void j2EEGetThreadCallStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetThreadCallStack_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		name.value = "";
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.j2EEGetThreadCallStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadCallStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetThreadCallStack_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadCallStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadCallStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadCallStack_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadCallStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadCallStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadCallStack_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadCallStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadCallStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetThreadCallStack_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadCallStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the J2EEThread[] j2EEGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetThreadList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread[] result = fixture.j2EEGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread[] j2EEGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetThreadList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread[] result = fixture.j2EEGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread[] j2EEGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread[] result = fixture.j2EEGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread[] j2EEGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread[] result = fixture.j2EEGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread[] j2EEGetThreadList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetThreadList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEThread[] result = fixture.j2EEGetThreadList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread2[] j2EEGetThreadList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetThreadList2_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread2[] result = fixture.j2EEGetThreadList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread2[] j2EEGetThreadList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetThreadList2_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread2[] result = fixture.j2EEGetThreadList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread2[] j2EEGetThreadList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadList2_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread2[] result = fixture.j2EEGetThreadList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread2[] j2EEGetThreadList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadList2_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEThread2[] result = fixture.j2EEGetThreadList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEThread2[] j2EEGetThreadList2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetThreadList2_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEThread2[] result = fixture.j2EEGetThreadList2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void j2EEGetThreadTaskStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetThreadTaskStack_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		name.value = "";
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.j2EEGetThreadTaskStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadTaskStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetThreadTaskStack_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadTaskStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadTaskStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadTaskStack_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadTaskStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadTaskStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetThreadTaskStack_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadTaskStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void j2EEGetThreadTaskStack(int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetThreadTaskStack_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int index = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.j2EEGetThreadTaskStack(index, name, lines);

		// add additional test code here
	}

	/**
	 * Run the GCInfo[] j2EEGetVMGCHistory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetVMGCHistory_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo[] result = fixture.j2EEGetVMGCHistory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo[] j2EEGetVMGCHistory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetVMGCHistory_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo[] result = fixture.j2EEGetVMGCHistory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo[] j2EEGetVMGCHistory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMGCHistory_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo[] result = fixture.j2EEGetVMGCHistory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo[] j2EEGetVMGCHistory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMGCHistory_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo[] result = fixture.j2EEGetVMGCHistory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo[] j2EEGetVMGCHistory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetVMGCHistory_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		GCInfo[] result = fixture.j2EEGetVMGCHistory();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo2[] j2EEGetVMGCHistory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetVMGCHistory2_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo2[] result = fixture.j2EEGetVMGCHistory2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo2[] j2EEGetVMGCHistory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetVMGCHistory2_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo2[] result = fixture.j2EEGetVMGCHistory2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo2[] j2EEGetVMGCHistory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMGCHistory2_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo2[] result = fixture.j2EEGetVMGCHistory2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo2[] j2EEGetVMGCHistory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMGCHistory2_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		GCInfo2[] result = fixture.j2EEGetVMGCHistory2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the GCInfo2[] j2EEGetVMGCHistory2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetVMGCHistory2_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		GCInfo2[] result = fixture.j2EEGetVMGCHistory2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeapInfo[] j2EEGetVMHeapInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetVMHeapInfo_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		HeapInfo[] result = fixture.j2EEGetVMHeapInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeapInfo[] j2EEGetVMHeapInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetVMHeapInfo_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		HeapInfo[] result = fixture.j2EEGetVMHeapInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeapInfo[] j2EEGetVMHeapInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMHeapInfo_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		HeapInfo[] result = fixture.j2EEGetVMHeapInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeapInfo[] j2EEGetVMHeapInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetVMHeapInfo_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		HeapInfo[] result = fixture.j2EEGetVMHeapInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HeapInfo[] j2EEGetVMHeapInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetVMHeapInfo_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		HeapInfo[] result = fixture.j2EEGetVMHeapInfo();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEWebSession[] j2EEGetWebSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testJ2EEGetWebSessionList_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEWebSession[] result = fixture.j2EEGetWebSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEWebSession[] j2EEGetWebSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testJ2EEGetWebSessionList_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEWebSession[] result = fixture.j2EEGetWebSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEWebSession[] j2EEGetWebSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetWebSessionList_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEWebSession[] result = fixture.j2EEGetWebSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEWebSession[] j2EEGetWebSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testJ2EEGetWebSessionList_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		J2EEWebSession[] result = fixture.j2EEGetWebSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the J2EEWebSession[] j2EEGetWebSessionList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testJ2EEGetWebSessionList_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		J2EEWebSession[] result = fixture.j2EEGetWebSessionList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DirEntry[] listDeveloperTraces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testListDeveloperTraces_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		DirEntry[] result = fixture.listDeveloperTraces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DirEntry[] listDeveloperTraces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testListDeveloperTraces_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		DirEntry[] result = fixture.listDeveloperTraces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DirEntry[] listDeveloperTraces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListDeveloperTraces_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		DirEntry[] result = fixture.listDeveloperTraces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DirEntry[] listDeveloperTraces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListDeveloperTraces_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		DirEntry[] result = fixture.listDeveloperTraces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the DirEntry[] listDeveloperTraces() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testListDeveloperTraces_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		DirEntry[] result = fixture.listDeveloperTraces();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LogFile[] listLogFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testListLogFiles_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		LogFile[] result = fixture.listLogFiles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LogFile[] listLogFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testListLogFiles_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		LogFile[] result = fixture.listLogFiles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LogFile[] listLogFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListLogFiles_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		LogFile[] result = fixture.listLogFiles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LogFile[] listLogFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListLogFiles_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		LogFile[] result = fixture.listLogFiles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the LogFile[] listLogFiles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testListLogFiles_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		LogFile[] result = fixture.listLogFiles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String parameterValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testParameterValue_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String parameter = "";

		String result = fixture.parameterValue(parameter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String parameterValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testParameterValue_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String parameter = "";

		String result = fixture.parameterValue(parameter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String parameterValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testParameterValue_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String parameter = "";

		String result = fixture.parameterValue(parameter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String parameterValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testParameterValue_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String parameter = "";

		String result = fixture.parameterValue(parameter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String parameterValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testParameterValue_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String parameter = "";

		String result = fixture.parameterValue(parameter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void readDeveloperTrace(String,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testReadDeveloperTrace_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		int size = 1;
		StringHolder name = new StringHolder();
		name.value = "";
		ArrayOfStringHolder lines = new ArrayOfStringHolder(new String[] {});

		fixture.readDeveloperTrace(filename, size, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void readDeveloperTrace(String,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testReadDeveloperTrace_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		int size = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.readDeveloperTrace(filename, size, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void readDeveloperTrace(String,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testReadDeveloperTrace_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		int size = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.readDeveloperTrace(filename, size, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void readDeveloperTrace(String,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testReadDeveloperTrace_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		int size = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.readDeveloperTrace(filename, size, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void readDeveloperTrace(String,int,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testReadDeveloperTrace_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String filename = "";
		int size = 1;
		StringHolder name = new StringHolder();
		ArrayOfStringHolder lines = new ArrayOfStringHolder();

		fixture.readDeveloperTrace(filename, size, name, lines);

		// add additional test code here
	}

	/**
	 * Run the void readLogFile(String,String,String,int,String,StringHolder,StringHolder,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testReadLogFile_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		String filter = "";
		String language = "";
		int maxentries = 1;
		String statecookie = "";
		StringHolder format = new StringHolder();
		format.value = "";
		StringHolder startcookie = new StringHolder();
		startcookie.value = "";
		StringHolder endcookie = new StringHolder();
		endcookie.value = "";
		ArrayOfStringHolder fields = new ArrayOfStringHolder(new String[] {});

		fixture.readLogFile(filename, filter, language, maxentries, statecookie, format, startcookie, endcookie, fields);

		// add additional test code here
	}

	/**
	 * Run the void readLogFile(String,String,String,int,String,StringHolder,StringHolder,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testReadLogFile_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		String filter = "";
		String language = "";
		int maxentries = 1;
		String statecookie = "";
		StringHolder format = new StringHolder();
		StringHolder startcookie = new StringHolder();
		StringHolder endcookie = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.readLogFile(filename, filter, language, maxentries, statecookie, format, startcookie, endcookie, fields);

		// add additional test code here
	}

	/**
	 * Run the void readLogFile(String,String,String,int,String,StringHolder,StringHolder,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testReadLogFile_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		String filter = "";
		String language = "";
		int maxentries = 1;
		String statecookie = "";
		StringHolder format = new StringHolder();
		StringHolder startcookie = new StringHolder();
		StringHolder endcookie = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.readLogFile(filename, filter, language, maxentries, statecookie, format, startcookie, endcookie, fields);

		// add additional test code here
	}

	/**
	 * Run the void readLogFile(String,String,String,int,String,StringHolder,StringHolder,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testReadLogFile_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String filename = "";
		String filter = "";
		String language = "";
		int maxentries = 1;
		String statecookie = "";
		StringHolder format = new StringHolder();
		StringHolder startcookie = new StringHolder();
		StringHolder endcookie = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.readLogFile(filename, filter, language, maxentries, statecookie, format, startcookie, endcookie, fields);

		// add additional test code here
	}

	/**
	 * Run the void readLogFile(String,String,String,int,String,StringHolder,StringHolder,StringHolder,ArrayOfStringHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testReadLogFile_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String filename = "";
		String filter = "";
		String language = "";
		int maxentries = 1;
		String statecookie = "";
		StringHolder format = new StringHolder();
		StringHolder startcookie = new StringHolder();
		StringHolder endcookie = new StringHolder();
		ArrayOfStringHolder fields = new ArrayOfStringHolder();

		fixture.readLogFile(filename, filter, language, maxentries, statecookie, format, startcookie, endcookie, fields);

		// add additional test code here
	}

	/**
	 * Run the void restartInstance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testRestartInstance_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;

		fixture.restartInstance(softtimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartInstance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testRestartInstance_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;

		fixture.restartInstance(softtimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartInstance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartInstance_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;

		fixture.restartInstance(softtimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartInstance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartInstance_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;

		fixture.restartInstance(softtimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartInstance(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testRestartInstance_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int softtimeout = 1;

		fixture.restartInstance(softtimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testRestartService_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.restartService();

		// add additional test code here
	}

	/**
	 * Run the void restartService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testRestartService_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.restartService();

		// add additional test code here
	}

	/**
	 * Run the void restartService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartService_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.restartService();

		// add additional test code here
	}

	/**
	 * Run the void restartService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartService_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.restartService();

		// add additional test code here
	}

	/**
	 * Run the void restartService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testRestartService_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		fixture.restartService();

		// add additional test code here
	}

	/**
	 * Run the void restartSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testRestartSystem_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.restartSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testRestartSystem_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.restartSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartSystem_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.restartSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testRestartSystem_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.restartSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void restartSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testRestartSystem_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.restartSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void sendSignal(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSendSignal_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int pid = 1;
		String signal = "";

		fixture.sendSignal(pid, signal);

		// add additional test code here
	}

	/**
	 * Run the void sendSignal(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testSendSignal_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int pid = 1;
		String signal = "";

		fixture.sendSignal(pid, signal);

		// add additional test code here
	}

	/**
	 * Run the void sendSignal(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSendSignal_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int pid = 1;
		String signal = "";

		fixture.sendSignal(pid, signal);

		// add additional test code here
	}

	/**
	 * Run the void sendSignal(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSendSignal_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int pid = 1;
		String signal = "";

		fixture.sendSignal(pid, signal);

		// add additional test code here
	}

	/**
	 * Run the void sendSignal(int,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testSendSignal_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int pid = 1;
		String signal = "";

		fixture.sendSignal(pid, signal);

		// add additional test code here
	}

	/**
	 * Run the void setProcessParameter(String,int,SetProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testSetProcessParameter_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;
		SetProfileParameter[] parameter = new SetProfileParameter[] {};

		fixture.setProcessParameter(processtype, pid, parameter);

		// add additional test code here
	}

	/**
	 * Run the void setProcessParameter(String,int,SetProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testSetProcessParameter_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;
		SetProfileParameter[] parameter = new SetProfileParameter[] {};

		fixture.setProcessParameter(processtype, pid, parameter);

		// add additional test code here
	}

	/**
	 * Run the void setProcessParameter(String,int,SetProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSetProcessParameter_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;
		SetProfileParameter[] parameter = new SetProfileParameter[] {};

		fixture.setProcessParameter(processtype, pid, parameter);

		// add additional test code here
	}

	/**
	 * Run the void setProcessParameter(String,int,SetProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSetProcessParameter_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;
		SetProfileParameter[] parameter = new SetProfileParameter[] {};

		fixture.setProcessParameter(processtype, pid, parameter);

		// add additional test code here
	}

	/**
	 * Run the void setProcessParameter(String,int,SetProfileParameter[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testSetProcessParameter_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String processtype = "";
		int pid = 1;
		SetProfileParameter[] parameter = new SetProfileParameter[] {};

		fixture.setProcessParameter(processtype, pid, parameter);

		// add additional test code here
	}

	/**
	 * Run the void shmDetach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testShmDetach_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.shmDetach();

		// add additional test code here
	}

	/**
	 * Run the void shmDetach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testShmDetach_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.shmDetach();

		// add additional test code here
	}

	/**
	 * Run the void shmDetach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testShmDetach_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.shmDetach();

		// add additional test code here
	}

	/**
	 * Run the void shmDetach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testShmDetach_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.shmDetach();

		// add additional test code here
	}

	/**
	 * Run the void shmDetach() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testShmDetach_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		fixture.shmDetach();

		// add additional test code here
	}

	/**
	 * Run the void shutdown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testShutdown_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int isSystemStop = 1;

		fixture.shutdown(isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void shutdown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testShutdown_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int isSystemStop = 1;

		fixture.shutdown(isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void shutdown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testShutdown_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int isSystemStop = 1;

		fixture.shutdown(isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void shutdown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testShutdown_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int isSystemStop = 1;

		fixture.shutdown(isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void shutdown(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testShutdown_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int isSystemStop = 1;

		fixture.shutdown(isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStart_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStart_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStart_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void start() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStart_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		fixture.start();

		// add additional test code here
	}

	/**
	 * Run the void startSystem(StartStopOption,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testStartSystem_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int waittimeout = 1;

		fixture.startSystem(options, prioritylevel, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void startSystem(StartStopOption,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStartSystem_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int waittimeout = 1;

		fixture.startSystem(options, prioritylevel, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void startSystem(StartStopOption,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartSystem_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int waittimeout = 1;

		fixture.startSystem(options, prioritylevel, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void startSystem(StartStopOption,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartSystem_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int waittimeout = 1;

		fixture.startSystem(options, prioritylevel, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void startSystem(StartStopOption,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStartSystem_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int waittimeout = 1;

		fixture.startSystem(options, prioritylevel, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void stop(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;
		int isSystemStop = 1;

		fixture.stop(softtimeout, isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void stop(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStop_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;
		int isSystemStop = 1;

		fixture.stop(softtimeout, isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void stop(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStop_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;
		int isSystemStop = 1;

		fixture.stop(softtimeout, isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void stop(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStop_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		int softtimeout = 1;
		int isSystemStop = 1;

		fixture.stop(softtimeout, isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void stop(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStop_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		int softtimeout = 1;
		int isSystemStop = 1;

		fixture.stop(softtimeout, isSystemStop);

		// add additional test code here
	}

	/**
	 * Run the void stopService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testStopService_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.stopService();

		// add additional test code here
	}

	/**
	 * Run the void stopService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStopService_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.stopService();

		// add additional test code here
	}

	/**
	 * Run the void stopService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopService_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.stopService();

		// add additional test code here
	}

	/**
	 * Run the void stopService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopService_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		fixture.stopService();

		// add additional test code here
	}

	/**
	 * Run the void stopService() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStopService_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());

		fixture.stopService();

		// add additional test code here
	}

	/**
	 * Run the void stopSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test
	public void testStopSystem_1()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.stopSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void stopSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStopSystem_2()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.stopSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void stopSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopSystem_3()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.stopSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void stopSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopSystem_4()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.stopSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Run the void stopSystem(StartStopOption,String,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStopSystem_5()
		throws Exception {
		SAPControl_BindingStub fixture = new SAPControl_BindingStub((URL) null, new DeployWSServiceLocator());
		StartStopOption options = StartStopOption.fromString("");
		String prioritylevel = "";
		int softtimeout = 1;
		int waittimeout = 1;

		fixture.stopSystem(options, prioritylevel, softtimeout, waittimeout);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:07 AM
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
	 * @generatedBy CodePro at 4/8/14 11:07 AM
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
	 * @generatedBy CodePro at 4/8/14 11:07 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SAPControl_BindingStubTest.class);
	}
}