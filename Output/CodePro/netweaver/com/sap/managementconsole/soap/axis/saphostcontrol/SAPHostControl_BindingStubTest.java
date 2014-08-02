package com.sap.managementconsole.soap.axis.saphostcontrol;

import java.net.URL;
import java.rmi.RemoteException;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.DeployWSServiceLocator;
import com.sap.managementconsole.soap.axis.saphostcontrol.holders.ArrayOfDatabaseComponentHolder;
import com.sap.managementconsole.soap.axis.saphostcontrol.holders.DatabaseStatusHolder;

/**
 * The class <code>SAPHostControl_BindingStubTest</code> contains tests for the class <code>{@link SAPHostControl_BindingStub}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:57 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SAPHostControl_BindingStubTest {
	/**
	 * Run the SAPHostControl_BindingStub() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testSAPHostControl_BindingStub_1()
		throws Exception {

		SAPHostControl_BindingStub result = new SAPHostControl_BindingStub();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPHostControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPHostControl_BindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testSAPHostControl_BindingStub_2()
		throws Exception {
		javax.xml.rpc.Service service = new Service();

		SAPHostControl_BindingStub result = new SAPHostControl_BindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPHostControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPHostControl_BindingStub(Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testSAPHostControl_BindingStub_3()
		throws Exception {
		javax.xml.rpc.Service service = null;

		SAPHostControl_BindingStub result = new SAPHostControl_BindingStub(service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPHostControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the SAPHostControl_BindingStub(URL,Service) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testSAPHostControl_BindingStub_4()
		throws Exception {
		URL endpointURL = new URL("");
		javax.xml.rpc.Service service = new DeployWSServiceLocator();

		SAPHostControl_BindingStub result = new SAPHostControl_BindingStub(endpointURL, service);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/managementconsole/soap/axis/saphostcontrol/SAPHostControl_BindingStub : Unsupported major.minor version 51.0
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
	 * Run the OperationResult ACOSPrepare(ACOperation[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testACOSPrepare_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		ACOperation[] aOperation = new ACOperation[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.ACOSPrepare(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult ACOSPrepare(ACOperation[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testACOSPrepare_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		ACOperation[] aOperation = new ACOperation[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.ACOSPrepare(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult ACOSPrepare(ACOperation[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testACOSPrepare_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		ACOperation[] aOperation = new ACOperation[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.ACOSPrepare(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult ACOSPrepare(ACOperation[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testACOSPrepare_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		ACOperation[] aOperation = new ACOperation[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.ACOSPrepare(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult ACOSPrepare(ACOperation[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testACOSPrepare_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		ACOperation[] aOperation = new ACOperation[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.ACOSPrepare(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult attachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testAttachDatabase_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.attachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult attachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testAttachDatabase_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.attachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult attachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAttachDatabase_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.attachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult attachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testAttachDatabase_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.attachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult attachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testAttachDatabase_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.attachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult callServiceOperation(InstanceServiceOperation,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCallServiceOperation_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceServiceOperation aOperation = new InstanceServiceOperation();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.callServiceOperation(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult callServiceOperation(InstanceServiceOperation,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCallServiceOperation_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceServiceOperation aOperation = new InstanceServiceOperation();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.callServiceOperation(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult callServiceOperation(InstanceServiceOperation,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testCallServiceOperation_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceServiceOperation aOperation = new InstanceServiceOperation();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.callServiceOperation(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult callServiceOperation(InstanceServiceOperation,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testCallServiceOperation_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceServiceOperation aOperation = new InstanceServiceOperation();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.callServiceOperation(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult callServiceOperation(InstanceServiceOperation,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testCallServiceOperation_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		InstanceServiceOperation aOperation = new InstanceServiceOperation();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.callServiceOperation(aOperation, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult cancelOperation(String,CancelOperationType,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCancelOperation_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		CancelOperationType aType = CancelOperationType.fromString("");
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.cancelOperation(aOperationID, aType, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult cancelOperation(String,CancelOperationType,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testCancelOperation_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		CancelOperationType aType = CancelOperationType.fromString("");
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.cancelOperation(aOperationID, aType, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult cancelOperation(String,CancelOperationType,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testCancelOperation_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		CancelOperationType aType = CancelOperationType.fromString("");
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.cancelOperation(aOperationID, aType, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult cancelOperation(String,CancelOperationType,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testCancelOperation_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		CancelOperationType aType = CancelOperationType.fromString("");
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.cancelOperation(aOperationID, aType, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult cancelOperation(String,CancelOperationType,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testCancelOperation_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String aOperationID = "";
		CancelOperationType aType = CancelOperationType.fromString("");
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.cancelOperation(aOperationID, aType, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCreateCall_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCreateCall_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCreateCall_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCreateCall_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Call createCall() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testCreateCall_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());

		Call result = fixture.createCall();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult detachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testDetachDatabase_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.detachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult detachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testDetachDatabase_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.detachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult detachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDetachDatabase_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.detachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult detachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testDetachDatabase_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.detachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult detachDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testDetachDatabase_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.detachDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult executeOperation(String,Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testExecuteOperation_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperation = "";
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.executeOperation(aOperation, aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult executeOperation(String,Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testExecuteOperation_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperation = "";
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.executeOperation(aOperation, aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult executeOperation(String,Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testExecuteOperation_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperation = "";
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.executeOperation(aOperation, aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult executeOperation(String,Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testExecuteOperation_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperation = "";
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.executeOperation(aOperation, aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult executeOperation(String,Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testExecuteOperation_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String aOperation = "";
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.executeOperation(aOperation, aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getCIMObject(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetCIMObject_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject[] result = fixture.getCIMObject(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getCIMObject(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetCIMObject_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject[] result = fixture.getCIMObject(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getCIMObject(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetCIMObject_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject[] result = fixture.getCIMObject(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getCIMObject(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetCIMObject_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject[] result = fixture.getCIMObject(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject[] getCIMObject(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetCIMObject_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject[] result = fixture.getCIMObject(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject getComputerSystem(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetComputerSystem_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject result = fixture.getComputerSystem(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject getComputerSystem(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetComputerSystem_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject result = fixture.getComputerSystem(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject getComputerSystem(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetComputerSystem_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject result = fixture.getComputerSystem(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject getComputerSystem(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetComputerSystem_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject result = fixture.getComputerSystem(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CIMObject getComputerSystem(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetComputerSystem_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		CIMObject result = fixture.getComputerSystem(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Property[] getDatabaseProperties(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetDatabaseProperties_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Property[] result = fixture.getDatabaseProperties(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Property[] getDatabaseProperties(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetDatabaseProperties_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Property[] result = fixture.getDatabaseProperties(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Property[] getDatabaseProperties(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetDatabaseProperties_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Property[] result = fixture.getDatabaseProperties(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Property[] getDatabaseProperties(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetDatabaseProperties_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Property[] result = fixture.getDatabaseProperties(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Property[] getDatabaseProperties(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetDatabaseProperties_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Property[] result = fixture.getDatabaseProperties(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void getDatabaseStatus(Property[],ArrayOfDatabaseComponentHolder,DatabaseStatusHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetDatabaseStatus_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		ArrayOfDatabaseComponentHolder result = new ArrayOfDatabaseComponentHolder(new DatabaseComponent[] {});
		DatabaseStatusHolder status = new DatabaseStatusHolder(DatabaseStatus.fromString(""));

		fixture.getDatabaseStatus(aArguments, result, status);

		// add additional test code here
	}

	/**
	 * Run the void getDatabaseStatus(Property[],ArrayOfDatabaseComponentHolder,DatabaseStatusHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetDatabaseStatus_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		ArrayOfDatabaseComponentHolder result = new ArrayOfDatabaseComponentHolder();
		DatabaseStatusHolder status = new DatabaseStatusHolder();

		fixture.getDatabaseStatus(aArguments, result, status);

		// add additional test code here
	}

	/**
	 * Run the void getDatabaseStatus(Property[],ArrayOfDatabaseComponentHolder,DatabaseStatusHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetDatabaseStatus_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		ArrayOfDatabaseComponentHolder result = new ArrayOfDatabaseComponentHolder();
		DatabaseStatusHolder status = new DatabaseStatusHolder();

		fixture.getDatabaseStatus(aArguments, result, status);

		// add additional test code here
	}

	/**
	 * Run the void getDatabaseStatus(Property[],ArrayOfDatabaseComponentHolder,DatabaseStatusHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetDatabaseStatus_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		ArrayOfDatabaseComponentHolder result = new ArrayOfDatabaseComponentHolder();
		DatabaseStatusHolder status = new DatabaseStatusHolder();

		fixture.getDatabaseStatus(aArguments, result, status);

		// add additional test code here
	}

	/**
	 * Run the void getDatabaseStatus(Property[],ArrayOfDatabaseComponentHolder,DatabaseStatusHolder) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetDatabaseStatus_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		ArrayOfDatabaseComponentHolder result = new ArrayOfDatabaseComponentHolder();
		DatabaseStatusHolder status = new DatabaseStatusHolder();

		fixture.getDatabaseStatus(aArguments, result, status);

		// add additional test code here
	}

	/**
	 * Run the OperationResult getOperationResults(String,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetOperationResults_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.getOperationResults(aOperationID, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult getOperationResults(String,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testGetOperationResults_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.getOperationResults(aOperationID, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult getOperationResults(String,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetOperationResults_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.getOperationResults(aOperationID, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult getOperationResults(String,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testGetOperationResults_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.getOperationResults(aOperationID, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult getOperationResults(String,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testGetOperationResults_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String aOperationID = "";
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.getOperationResults(aOperationID, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testIsOperationFinished_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testIsOperationFinished_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testIsOperationFinished_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testIsOperationFinished_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testIsOperationFinished_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isOperationFinished(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testIsOperationFinished_6()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		String aOperationID = "";

		boolean result = fixture.isOperationFinished(aOperationID);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Database[] listDatabases(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testListDatabases_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Database[] result = fixture.listDatabases(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database[] listDatabases(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testListDatabases_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Database[] result = fixture.listDatabases(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database[] listDatabases(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListDatabases_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Database[] result = fixture.listDatabases(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database[] listDatabases(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListDatabases_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Database[] result = fixture.listDatabases(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Database[] listDatabases(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testListDatabases_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		Database[] result = fixture.listDatabases(aArguments);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] listInstances(InstanceSelector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testListInstances_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceSelector aSelector = new InstanceSelector();

		SAPInstance[] result = fixture.listInstances(aSelector);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] listInstances(InstanceSelector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testListInstances_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceSelector aSelector = new InstanceSelector();

		SAPInstance[] result = fixture.listInstances(aSelector);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] listInstances(InstanceSelector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListInstances_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceSelector aSelector = new InstanceSelector();

		SAPInstance[] result = fixture.listInstances(aSelector);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] listInstances(InstanceSelector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testListInstances_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		InstanceSelector aSelector = new InstanceSelector();

		SAPInstance[] result = fixture.listInstances(aSelector);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SAPInstance[] listInstances(InstanceSelector) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testListInstances_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		InstanceSelector aSelector = new InstanceSelector();

		SAPInstance[] result = fixture.listInstances(aSelector);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult liveDatabaseUpdate(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testLiveDatabaseUpdate_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.liveDatabaseUpdate(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult liveDatabaseUpdate(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testLiveDatabaseUpdate_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.liveDatabaseUpdate(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult liveDatabaseUpdate(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testLiveDatabaseUpdate_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.liveDatabaseUpdate(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult liveDatabaseUpdate(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testLiveDatabaseUpdate_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.liveDatabaseUpdate(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult liveDatabaseUpdate(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testLiveDatabaseUpdate_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.liveDatabaseUpdate(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setDatabaseProperty(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testSetDatabaseProperty_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		fixture.setDatabaseProperty(aArguments);

		// add additional test code here
	}

	/**
	 * Run the void setDatabaseProperty(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testSetDatabaseProperty_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		fixture.setDatabaseProperty(aArguments);

		// add additional test code here
	}

	/**
	 * Run the void setDatabaseProperty(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSetDatabaseProperty_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		fixture.setDatabaseProperty(aArguments);

		// add additional test code here
	}

	/**
	 * Run the void setDatabaseProperty(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testSetDatabaseProperty_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		fixture.setDatabaseProperty(aArguments);

		// add additional test code here
	}

	/**
	 * Run the void setDatabaseProperty(Property[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testSetDatabaseProperty_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};

		fixture.setDatabaseProperty(aArguments);

		// add additional test code here
	}

	/**
	 * Run the OperationResult startDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testStartDatabase_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStartDatabase_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartDatabase_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartDatabase_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStartDatabase_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testStartInstance_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStartInstance_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartInstance_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStartInstance_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult startInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStartInstance_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.startInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testStopDatabase_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStopDatabase_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopDatabase_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopDatabase_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopDatabase(Property[],OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStopDatabase_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		Property[] aArguments = new Property[] {};
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopDatabase(aArguments, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testStopInstance_1()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = java.rmi.RemoteException.class)
	public void testStopInstance_2()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopInstance_3()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.AxisFault.class)
	public void testStopInstance_4()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub(new URL(""), new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the OperationResult stopInstance(SAPInstance,OperationOptions) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test(expected = org.apache.axis.NoEndPointException.class)
	public void testStopInstance_5()
		throws Exception {
		SAPHostControl_BindingStub fixture = new SAPHostControl_BindingStub((URL) null, new DeployWSServiceLocator());
		SAPInstance aInstance = new SAPInstance();
		OperationOptions aOptions = new OperationOptions();

		OperationResult result = fixture.stopInstance(aInstance, aOptions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
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
	 * @generatedBy CodePro at 4/8/14 10:57 AM
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
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SAPHostControl_BindingStubTest.class);
	}
}