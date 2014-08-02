package com.sap.netweaver.porta.mon;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.Credentials;

/**
 * The class <code>DeployManagerAuthenticationCallbackTest</code> contains tests for the class <code>{@link DeployManagerAuthenticationCallback}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DeployManagerAuthenticationCallbackTest {
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
		DeployManagerAuthenticationCallback fixture = new DeployManagerAuthenticationCallback();
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
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetCredentials_2()
		throws Exception {
		DeployManagerAuthenticationCallback fixture = new DeployManagerAuthenticationCallback();
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
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testGetCredentials_3()
		throws Exception {
		DeployManagerAuthenticationCallback fixture = new DeployManagerAuthenticationCallback();
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
		new org.junit.runner.JUnitCore().run(DeployManagerAuthenticationCallbackTest.class);
	}
}