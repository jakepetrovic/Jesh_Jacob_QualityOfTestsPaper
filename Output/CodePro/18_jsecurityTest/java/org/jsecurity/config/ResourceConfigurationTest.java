package org.jsecurity.config;

import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ResourceConfigurationTest</code> contains tests for the class <code>{@link ResourceConfiguration}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:08 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ResourceConfigurationTest {
	/**
	 * Run the SecurityManager getSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:08 PM
	 */
	@Test
	public void testGetSecurityManager_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();

		SecurityManager result = fixture.getSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setSecurityManager(SecurityManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:08 PM
	 */
	@Test
	public void testSetSecurityManager_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();
		SecurityManager securityManager = new DefaultSecurityManager();

		fixture.setSecurityManager(securityManager);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:08 PM
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
	 * @generatedBy CodePro at 4/19/14 3:08 PM
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
	 * @generatedBy CodePro at 4/19/14 3:08 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ResourceConfigurationTest.class);
	}
}