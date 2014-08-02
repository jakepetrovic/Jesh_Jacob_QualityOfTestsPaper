package com.sap.netweaver.porta.core.nw7;

import org.junit.*;
import static org.junit.Assert.*;
import com.sap.netweaver.porta.core.AuthenticationCallback;
import com.sap.netweaver.porta.core.CoreException;
import com.sap.netweaver.porta.core.snippets.SnippetUseDeployManager;

/**
 * The class <code>CoreModuleImplTest</code> contains tests for the class <code>{@link CoreModuleImpl}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:50 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CoreModuleImplTest {
	/**
	 * Run the void checkInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:50 AM
	 */
	@Test
	public void testCheckInitialized_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1);
		fixture.callback = new SnippetUseDeployManager();
		fixture.instNr = 1;
		fixture.host = "";

		fixture.checkInitialized();

		// add additional test code here
	}

	/**
	 * Run the void checkInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:50 AM
	 */
	@Test
	public void testCheckInitialized_2()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1);
		fixture.callback = new SnippetUseDeployManager();
		fixture.instNr = 1;
		fixture.host = "";

		fixture.checkInitialized();

		// add additional test code here
	}

	/**
	 * Run the void checkInitialized() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:50 AM
	 */
	@Test(expected = com.sap.netweaver.porta.core.CoreException.class)
	public void testCheckInitialized_3()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1);
		fixture.callback = new SnippetUseDeployManager();
		fixture.instNr = 1;
		fixture.host = "";

		fixture.checkInitialized();

		// add additional test code here
	}

	/**
	 * Run the void setAuthenticationCallback(AuthenticationCallback) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:50 AM
	 */
	@Test
	public void testSetAuthenticationCallback_1()
		throws Exception {
		DeployManagerImpl fixture = new DeployManagerImpl("", 1);
		fixture.callback = new SnippetUseDeployManager();
		fixture.instNr = 1;
		fixture.host = "";
		AuthenticationCallback callback = new SnippetUseDeployManager();

		fixture.setAuthenticationCallback(callback);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:50 AM
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
	 * @generatedBy CodePro at 4/8/14 10:50 AM
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
	 * @generatedBy CodePro at 4/8/14 10:50 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoreModuleImplTest.class);
	}
}