package com.sap.netweaver.porta.ide.eclipse.server.control;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.AuthenticationRefusedException;
import com.sap.netweaver.porta.core.Credentials;

/**
 * The class <code>AuthCallbackTest</code> contains tests for the class <code>{@link AuthCallback}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthCallbackTest {
	/**
	 * Run the AuthCallback(boolean,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testAuthCallback_1()
		throws Exception {
		boolean isStartStop = true;
		String defaultUser = "";

		AuthCallback result = new AuthCallback(isStartStop, defaultUser);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: com/sap/netweaver/porta/ide/eclipse/server/control/AuthCallback : Unsupported major.minor version 51.0
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
	 * Run the Credentials getCredentials(AuthenticationReason) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		AuthCallback fixture = new AuthCallback(true, "");
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Credentials getCredentials(AuthenticationReason) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testGetCredentials_2()
		throws Exception {
		AuthCallback fixture = new AuthCallback(true, "");
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Credentials getCredentials(AuthenticationReason) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.AuthenticationRefusedException.class)
	public void testGetCredentials_3()
		throws Exception {
		AuthCallback fixture = new AuthCallback(false, "");
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Credentials getCredentials(AuthenticationReason) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.AuthenticationRefusedException.class)
	public void testGetCredentials_4()
		throws Exception {
		AuthCallback fixture = new AuthCallback(true, "");
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Credentials getCredentials(AuthenticationReason) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetCredentials_5()
		throws Exception {
		AuthCallback fixture = new AuthCallback(true, "");
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(AuthCallbackTest.class);
	}
}