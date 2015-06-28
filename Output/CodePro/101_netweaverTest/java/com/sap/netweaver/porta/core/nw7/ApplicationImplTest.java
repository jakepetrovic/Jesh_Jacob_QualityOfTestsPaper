package com.sap.netweaver.porta.core.nw7;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.engine.services.dc.wsgate.Application;
import com.sap.netweaver.porta.core.ApplicationStatus;

/**
 * The class <code>ApplicationImplTest</code> contains tests for the class <code>{@link ApplicationImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:57 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ApplicationImplTest {
	/**
	 * Run the ApplicationImpl(Application) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testApplicationImpl_1()
		throws Exception {
		Application proxy = new Application();

		ApplicationImpl result = new ApplicationImpl(proxy);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/core/nw7/ApplicationImpl : Unsupported major.minor version 51.0
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
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());
		Object obj = new ApplicationImpl(new Application());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());
		Object obj = new ApplicationImpl(new Application());

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLocation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		String result = fixture.getLocation();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Application getProxy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetProxy_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		Application result = fixture.getProxy();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ApplicationStatus getStatus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetStatus_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		ApplicationStatus result = fixture.getStatus();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVendor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetVendor_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		String result = fixture.getVendor();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getVersion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testGetVersion_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		String result = fixture.getVersion();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:57 AM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		ApplicationImpl fixture = new ApplicationImpl(new Application());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
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
		new org.junit.runner.JUnitCore().run(ApplicationImplTest.class);
	}
}