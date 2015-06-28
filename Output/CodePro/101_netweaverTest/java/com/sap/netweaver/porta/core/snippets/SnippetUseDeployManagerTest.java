package com.sap.netweaver.porta.core.snippets;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationReason;
import com.sap.netweaver.porta.core.Credentials;

/**
 * The class <code>SnippetUseDeployManagerTest</code> contains tests for the class <code>{@link SnippetUseDeployManager}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:37 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SnippetUseDeployManagerTest {
	/**
	 * Run the SnippetUseDeployManager() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testSnippetUseDeployManager_1()
		throws Exception {
		SnippetUseDeployManager result = new SnippetUseDeployManager();
		assertNotNull(result);
		// add additional test code here
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
		SnippetUseDeployManager fixture = new SnippetUseDeployManager();
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
		SnippetUseDeployManager fixture = new SnippetUseDeployManager();
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
	public void testGetCredentials_3()
		throws Exception {
		SnippetUseDeployManager fixture = new SnippetUseDeployManager();
		AuthenticationReason reason = AuthenticationReason.AUTHORIZATION_REQUIRED;

		Credentials result = fixture.getCredentials(reason);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:37 AM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		SnippetUseDeployManager.main(args);

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
		new org.junit.runner.JUnitCore().run(SnippetUseDeployManagerTest.class);
	}
}