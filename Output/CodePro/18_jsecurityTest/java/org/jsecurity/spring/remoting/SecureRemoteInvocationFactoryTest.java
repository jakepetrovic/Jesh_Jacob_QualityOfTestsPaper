package org.jsecurity.spring.remoting;

import org.aopalliance.intercept.MethodInvocation;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.remoting.support.RemoteInvocation;

/**
 * The class <code>SecureRemoteInvocationFactoryTest</code> contains tests for the class <code>{@link SecureRemoteInvocationFactory}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SecureRemoteInvocationFactoryTest {
	/**
	 * Run the SecureRemoteInvocationFactory() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSecureRemoteInvocationFactory_1()
		throws Exception {
		SecureRemoteInvocationFactory result = new SecureRemoteInvocationFactory();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the RemoteInvocation createRemoteInvocation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testCreateRemoteInvocation_1()
		throws Exception {
		SecureRemoteInvocationFactory fixture = new SecureRemoteInvocationFactory();
		MethodInvocation methodInvocation = null;

		RemoteInvocation result = fixture.createRemoteInvocation(methodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the RemoteInvocation createRemoteInvocation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateRemoteInvocation_2()
		throws Exception {
		SecureRemoteInvocationFactory fixture = new SecureRemoteInvocationFactory();
		MethodInvocation methodInvocation = null;

		RemoteInvocation result = fixture.createRemoteInvocation(methodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the RemoteInvocation createRemoteInvocation(MethodInvocation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateRemoteInvocation_3()
		throws Exception {
		SecureRemoteInvocationFactory fixture = new SecureRemoteInvocationFactory();
		MethodInvocation methodInvocation = null;

		RemoteInvocation result = fixture.createRemoteInvocation(methodInvocation);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SecureRemoteInvocationFactoryTest.class);
	}
}