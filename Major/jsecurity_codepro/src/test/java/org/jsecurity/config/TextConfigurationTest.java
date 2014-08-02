package org.jsecurity.config;

import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TextConfigurationTest</code> contains tests for the class <code>{@link TextConfiguration}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class TextConfigurationTest {
	/**
	 * Run the String getConfig() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetConfig_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();

		String result = fixture.getConfig();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = null;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = null;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = null;

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void loadTextConfig(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testLoadTextConfig_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();
		String config = "";

		fixture.loadTextConfig(config);

		// add additional test code here
	}

	/**
	 * Run the void setConfig(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetConfig_1()
		throws Exception {
		IniConfiguration fixture = new IniConfiguration();
		fixture.securityManager = new DefaultSecurityManager();
		String config = "";

		fixture.setConfig(config);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TextConfigurationTest.class);
	}
}