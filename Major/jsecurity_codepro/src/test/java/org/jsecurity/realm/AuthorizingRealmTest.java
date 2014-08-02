package org.jsecurity.realm;

import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.AuthorizationInfo;
import org.jsecurity.authz.Permission;
import org.jsecurity.authz.SimpleAuthorizingAccount;
import org.jsecurity.authz.UnauthorizedException;
import org.jsecurity.authz.permission.AllPermission;
import org.jsecurity.authz.permission.PermissionResolver;
import org.jsecurity.authz.permission.WildcardPermissionResolver;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.CacheException;
import org.jsecurity.cache.HashtableCache;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AuthorizingRealmTest</code> contains tests for the class <code>{@link AuthorizingRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthorizingRealmTest {
	/**
	 * Run the void afterAuthorizationCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterAuthorizationCacheSet_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.afterAuthorizationCacheSet();

		// add additional test code here
	}

	/**
	 * Run the void afterCacheManagerSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterCacheManagerSet_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.afterCacheManagerSet();

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermission_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Permission permission = new AllPermission();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermission(permission, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermission_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Permission permission = new AllPermission();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermission(permission, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testCheckPermission_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Permission permission = new AllPermission();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermission(permission, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testCheckPermission_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Permission permission = new AllPermission();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermission(permission, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermission_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();
		String permission = "";

		fixture.checkPermission(subjectIdentifier, permission);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testCheckPermission_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();
		String permission = "";

		fixture.checkPermission(subjectIdentifier, permission);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(PrincipalCollection,Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermission_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Permission permission = new AllPermission();

		fixture.checkPermission(principal, permission);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = null;
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testCheckPermissions_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkPermissions(permissions, info);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<Permission> permissions = new Vector();

		fixture.checkPermissions(principal, permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_8()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		fixture.checkPermissions(subjectIdentifier);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_9()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		fixture.checkPermissions(subjectIdentifier);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckPermissions_10()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		fixture.checkPermissions(subjectIdentifier);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testCheckPermissions_11()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		fixture.checkPermissions(subjectIdentifier);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRole_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String role = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRole(role, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRole_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String role = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRole(role, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testCheckRole_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String role = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRole(role, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRole_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		String role = "";

		fixture.checkRole(principal, role);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<String> roles = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRoles(roles, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<String> roles = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRoles(roles, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<String> roles = null;
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRoles(roles, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<String> roles = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRoles(roles, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<String> roles = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		fixture.checkRoles(roles, info);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(PrincipalCollection,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testCheckRoles_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<String> roles = new Vector();

		fixture.checkRoles(principal, roles);

		// add additional test code here
	}

	/**
	 * Run the void clearCachedAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testClearCachedAuthorizationInfo_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = null;

		fixture.clearCachedAuthorizationInfo(principals);

		// add additional test code here
	}

	/**
	 * Run the void clearCachedAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testClearCachedAuthorizationInfo_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.clearCachedAuthorizationInfo(principals);

		// add additional test code here
	}

	/**
	 * Run the void clearCachedAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testClearCachedAuthorizationInfo_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.clearCachedAuthorizationInfo(principals);

		// add additional test code here
	}

	/**
	 * Run the void clearCachedAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testClearCachedAuthorizationInfo_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.clearCachedAuthorizationInfo(principals);

		// add additional test code here
	}

	/**
	 * Run the Cache getAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationCache_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		Cache result = fixture.getAuthorizationCache();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAuthorizationCacheKey(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationCacheKey_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		Object result = fixture.getAuthorizationCacheKey(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthorizationCacheName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationCacheName_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		String result = fixture.getAuthorizationCacheName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationInfo_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = null;

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationInfo_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationInfo_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAuthorizationInfo_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetAuthorizationInfo_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo getAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetAuthorizationInfo_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.getAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PermissionResolver getPermissionResolver() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetPermissionResolver_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		PermissionResolver result = fixture.getPermissionResolver();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasAllRoles(PrincipalCollection,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasAllRoles_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(principal, roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(PrincipalCollection,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasAllRoles_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(principal, roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(PrincipalCollection,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasAllRoles_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(principal, roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = null;

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String roleIdentifier = "";
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.hasRole(roleIdentifier, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		String roleIdentifier = "";

		boolean result = fixture.hasRole(principal, roleIdentifier);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRole_8()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		String roleIdentifier = "";

		boolean result = fixture.hasRole(principal, roleIdentifier);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<String> roleIdentifiers = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.hasRoles(roleIdentifiers, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<String> roleIdentifiers = null;
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.hasRoles(roleIdentifiers, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<String> roleIdentifiers = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.hasRoles(roleIdentifiers, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<String> roleIdentifiers = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.hasRoles(roleIdentifiers, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<String> roleIdentifiers = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.hasRoles(roleIdentifiers, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(PrincipalCollection,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		List<String> roleIdentifiers = null;

		boolean[] result = fixture.hasRoles(principal, roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(PrincipalCollection,List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testHasRoles_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		List<String> roleIdentifiers = new Vector();

		boolean[] result = fixture.hasRoles(principal, roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_8()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_9()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_10()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_11()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_12()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_13()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_14()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInitAuthorizationCache_15()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the void initAuthorizationCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testInitAuthorizationCache_16()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();

		fixture.initAuthorizationCache();

		// add additional test code here
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.isPermitted(permissions, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<Permission> permissions = null;
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.isPermitted(permissions, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.isPermitted(permissions, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.isPermitted(permissions, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		List<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean[] result = fixture.isPermitted(permissions, info);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPermitted(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();
		String permission = "";

		boolean result = fixture.isPermitted(principals, permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(PrincipalCollection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();
		String permission = "";

		boolean result = fixture.isPermitted(principals, permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean[] isPermitted(PrincipalCollection,List<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_8()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();
		List<Permission> permissions = new Vector();

		boolean[] result = fixture.isPermitted(principals, permissions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPermitted(PrincipalCollection,Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_9()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(principals, permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(PrincipalCollection,Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_10()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(principals, permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean[] isPermitted(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_11()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		boolean[] result = fixture.isPermitted(subjectIdentifier);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermitted_12()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		boolean[] result = fixture.isPermitted(subjectIdentifier);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_3()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_4()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_5()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_6()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = null;
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>,AuthorizationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_7()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Collection<Permission> permissions = new Vector();
		AuthorizationInfo info = new SimpleAuthorizingAccount();

		boolean result = fixture.isPermittedAll(permissions, info);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_8()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(principal, permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_9()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(principal, permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_10()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principal = new SimplePrincipalCollection();
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(principal, permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_11()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();
		String permission1 = null;

		boolean result = fixture.isPermittedAll(subjectIdentifier, permission1);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_12()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();
		String permission1 = null;

		boolean result = fixture.isPermittedAll(subjectIdentifier, permission1);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_13()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		boolean result = fixture.isPermittedAll(subjectIdentifier);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(PrincipalCollection,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsPermittedAll_14()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection subjectIdentifier = new SimplePrincipalCollection();

		boolean result = fixture.isPermittedAll(subjectIdentifier);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testOnLogout_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void setAuthorizationCache(Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAuthorizationCache_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Cache authorizationCache = new HashtableCache("");

		fixture.setAuthorizationCache(authorizationCache);

		// add additional test code here
	}

	/**
	 * Run the void setAuthorizationCache(Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAuthorizationCache_2()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		Cache authorizationCache = null;

		fixture.setAuthorizationCache(authorizationCache);

		// add additional test code here
	}

	/**
	 * Run the void setAuthorizationCacheName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAuthorizationCacheName_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		String authorizationCacheName = "";

		fixture.setAuthorizationCacheName(authorizationCacheName);

		// add additional test code here
	}

	/**
	 * Run the void setPermissionResolver(PermissionResolver) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetPermissionResolver_1()
		throws Exception {
		AuthorizingRealm fixture = new SimpleAccountRealm();
		PermissionResolver permissionResolver = new WildcardPermissionResolver();

		fixture.setPermissionResolver(permissionResolver);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AuthorizingRealmTest.class);
	}
}