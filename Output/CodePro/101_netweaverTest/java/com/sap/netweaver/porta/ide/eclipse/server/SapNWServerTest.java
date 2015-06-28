package com.sap.netweaver.porta.ide.eclipse.server;

import java.net.URL;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.IModuleType;
import org.eclipse.wst.server.core.ServerPort;
import org.eclipse.wst.server.core.internal.DeletedModule;
import org.eclipse.wst.server.core.internal.ModuleType;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.Server;

/**
 * The class <code>SapNWServerTest</code> contains tests for the class <code>{@link SapNWServer}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SapNWServerTest {
	/**
	 * Run the SapNWServer() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSapNWServer_1()
		throws Exception {

		SapNWServer result = new SapNWServer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/SapNWServer : Unsupported major.minor version 51.0
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
	 * Run the SapNWServer(boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSapNWServer_2()
		throws Exception {
		boolean mock = true;

		SapNWServer result = new SapNWServer(mock);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/SapNWServer : Unsupported major.minor version 51.0
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
	 * Run the IStatus canModifyModules(IModule[],IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanModifyModules_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] add = new IModule[] {};
		IModule[] remove = new IModule[] {};

		IStatus result = fixture.canModifyModules(add, remove);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canModifyModules(IModule[],IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanModifyModules_2()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] add = new IModule[] {};
		IModule[] remove = new IModule[] {};

		IStatus result = fixture.canModifyModules(add, remove);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IStatus canModifyModules(IModule[],IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testCanModifyModules_3()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] add = new IModule[] {};
		IModule[] remove = new IModule[] {};

		IStatus result = fixture.canModifyModules(add, remove);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		fixture.dispose();

		// add additional test code here
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_2()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_3()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_4()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_5()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_6()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_7()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {new DeletedModule("", "", ModuleType.getModuleType("", ""))};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_8()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getChildModules(IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetChildModules_9()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] module = new IModule[] {};

		IModule[] result = fixture.getChildModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getInstanceNumber() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetInstanceNumber_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		int result = fixture.getInstanceNumber();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the URL getModuleRootURL(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetModuleRootURL_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		URL result = fixture.getModuleRootURL(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getModuleRootURL(IModule,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetModuleRootURL_2()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		String host = "";
		int port = 80;

		URL result = fixture.getModuleRootURL(module, host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getModuleRootURL(IModule,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetModuleRootURL_3()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		String host = "";
		int port = 1;

		URL result = fixture.getModuleRootURL(module, host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getModuleRootURL(IModule,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetModuleRootURL_4()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		String host = "";
		int port = 80;

		URL result = fixture.getModuleRootURL(module, host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the URL getModuleRootURL(IModule,String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetModuleRootURL_5()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = null;
		String host = "";
		int port = 1;

		URL result = fixture.getModuleRootURL(module, host, port);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getRootModules(IModule) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRootModules_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));

		IModule[] result = fixture.getRootModules(module);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getRootModules(IModule,IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRootModules_2()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		IModule[] ears = new IModule[] {};

		IModule[] result = fixture.getRootModules(module, ears);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getRootModules(IModule,IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRootModules_3()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		IModule[] ears = new IModule[] {};

		IModule[] result = fixture.getRootModules(module, ears);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getRootModules(IModule,IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRootModules_4()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		IModule[] ears = new IModule[] {};

		IModule[] result = fixture.getRootModules(module, ears);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IModule[] getRootModules(IModule,IModule[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetRootModules_5()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule module = new DeletedModule("", "", ModuleType.getModuleType("", ""));
		IModule[] ears = new IModule[] {};

		IModule[] result = fixture.getRootModules(module, ears);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetServerCore_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		Server result = fixture.getServerCore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetServerCore_2()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		Server result = fixture.getServerCore();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetServerCore_3()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		String host = "";
		int instance = 1;

		Server result = fixture.getServerCore(host, instance);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetServerCore_4()
		throws Exception {
		SapNWServer fixture = new SapNWServer(false);
		String host = "";
		int instance = 1;

		Server result = fixture.getServerCore(host, instance);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetServerCore_5()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		String host = "";
		int instance = 1;

		Server result = fixture.getServerCore(host, instance);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Server getServerCore(String,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetServerCore_6()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		String host = "";
		int instance = 1;

		Server result = fixture.getServerCore(host, instance);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ServerPort[] getServerPorts() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetServerPorts_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		ServerPort[] result = fixture.getServerPorts();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);

		fixture.initialize();

		// add additional test code here
	}

	/**
	 * Run the void modifyModules(IModule[],IModule[],IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testModifyModules_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IModule[] add = new IModule[] {};
		IModule[] remove = new IModule[] {};
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.modifyModules(add, remove, monitor);

		// add additional test code here
	}

	/**
	 * Run the void setDefaults(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetDefaults_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		IProgressMonitor monitor = new NullProgressMonitor();

		fixture.setDefaults(monitor);

		// add additional test code here
	}

	/**
	 * Run the void setInstanceNumber(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSetInstanceNumber_1()
		throws Exception {
		SapNWServer fixture = new SapNWServer(true);
		int instNr = 1;

		fixture.setInstanceNumber(instNr);

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
		new org.junit.runner.JUnitCore().run(SapNWServerTest.class);
	}
}