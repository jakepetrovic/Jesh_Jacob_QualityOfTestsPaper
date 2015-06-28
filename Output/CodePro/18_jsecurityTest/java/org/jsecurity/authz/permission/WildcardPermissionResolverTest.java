package org.jsecurity.authz.permission;

import org.jsecurity.authz.Permission;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WildcardPermissionResolverTest</code> contains tests for the class <code>{@link WildcardPermissionResolver}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class WildcardPermissionResolverTest {
	/**
	 * Run the Permission resolvePermission(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testResolvePermission_1()
		throws Exception {
		WildcardPermissionResolver fixture = new WildcardPermissionResolver();
		String permissionString = "";

		Permission result = fixture.resolvePermission(permissionString);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(WildcardPermissionResolverTest.class);
	}
}