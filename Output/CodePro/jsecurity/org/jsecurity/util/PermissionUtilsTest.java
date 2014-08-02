package org.jsecurity.util;

import java.util.Collection;
import java.util.Set;
import java.util.Vector;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PermissionUtilsTest</code> contains tests for the class <code>{@link PermissionUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:15 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PermissionUtilsTest {
	/**
	 * Run the Set<Permission> resolveDelimitedPermissions(String,PermissionResolver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testResolveDelimitedPermissions_1()
		throws Exception {
		String s = "";
		PermissionResolver permissionResolver = new WildcardPermissionResolver();

		Set<Permission> result = PermissionUtils.resolveDelimitedPermissions(s, permissionResolver);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Permission> resolvePermissions(Collection<String>,PermissionResolver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testResolvePermissions_1()
		throws Exception {
		Collection<String> permissionStrings = new Vector();
		PermissionResolver permissionResolver = new WildcardPermissionResolver();

		Set<Permission> result = PermissionUtils.resolvePermissions(permissionStrings, permissionResolver);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Permission> resolvePermissions(Collection<String>,PermissionResolver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testResolvePermissions_2()
		throws Exception {
		Collection<String> permissionStrings = new Vector();
		PermissionResolver permissionResolver = new WildcardPermissionResolver();

		Set<Permission> result = PermissionUtils.resolvePermissions(permissionStrings, permissionResolver);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toPermissionStrings(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testToPermissionStrings_1()
		throws Exception {
		String permissionsString = "";

		Set<String> result = PermissionUtils.toPermissionStrings(permissionsString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toPermissionStrings(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testToPermissionStrings_2()
		throws Exception {
		String permissionsString = "";

		Set<String> result = PermissionUtils.toPermissionStrings(permissionsString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toPermissionStrings(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	@Test
	public void testToPermissionStrings_3()
		throws Exception {
		String permissionsString = "";

		Set<String> result = PermissionUtils.toPermissionStrings(permissionsString);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:15 PM
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
	 * @generatedBy CodePro at 4/19/14 3:15 PM
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
	 * @generatedBy CodePro at 4/19/14 3:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PermissionUtilsTest.class);
	}
}