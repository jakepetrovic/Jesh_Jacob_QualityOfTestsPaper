package com.sap.netweaver.porta.core.mock;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.ApplicationStatus;

/**
 * The class <code>ApplicationMockTest</code> contains tests for the class <code>{@link ApplicationMock}</code>.
 *
 * @generatedBy CodePro at 4/8/14 11:14 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ApplicationMockTest {
	/**
	 * Run the ApplicationMock(File) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testApplicationMock_1()
		throws Exception {
		File archive = new File("");

		ApplicationMock result = new ApplicationMock(archive);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/mock/ApplicationMock : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		ApplicationMock o = new ApplicationMock(new File(""));
		o.setId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/mock/ApplicationMock : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		ApplicationMock o = new ApplicationMock(new File(""));
		o.setId("");

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/mock/ApplicationMock : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
		assertTrue(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.getLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ApplicationStatus getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		ApplicationStatus result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetVendor_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.getVendor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setLocation(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetLocation_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		String location = "";

		fixture.setLocation(location);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setStatus(ApplicationStatus) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetStatus_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		ApplicationStatus status = ApplicationStatus.IMPLICIT_STOPPED;

		fixture.setStatus(status);

		// add additional test code here
	}

	/**
	 * Run the void setVendor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetVendor_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		String vendor = "";

		fixture.setVendor(vendor);

		// add additional test code here
	}

	/**
	 * Run the void setVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testSetVersion_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");
		String version = "";

		fixture.setVersion(version);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ApplicationMock fixture = new ApplicationMock(new File(""));
		fixture.setVersion("");
		fixture.setName("");
		fixture.setId("");
		fixture.setLocation("");
		fixture.setStatus(ApplicationStatus.IMPLICIT_STOPPED);
		fixture.setVendor("");

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 11:14 AM
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
	 * @generatedBy CodePro at 4/8/14 11:14 AM
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
	 * @generatedBy CodePro at 4/8/14 11:14 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ApplicationMockTest.class);
	}
}