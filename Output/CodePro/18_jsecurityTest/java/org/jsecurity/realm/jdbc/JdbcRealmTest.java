package org.jsecurity.realm.jdbc;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Set;
import java.util.Vector;
import javax.sql.DataSource;
import org.hsqldb.jdbc.jdbcConnection;
import org.hsqldb.persist.HsqlProperties;
import org.jsecurity.authc.AccountException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.AuthorizationInfo;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.jdbc.datasource.lookup.IsolationLevelDataSourceRouter;

/**
 * The class <code>JdbcRealmTest</code> contains tests for the class <code>{@link JdbcRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JdbcRealmTest {
	/**
	 * Run the JdbcRealm() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testJdbcRealm_1()
		throws Exception {
		JdbcRealm result = new JdbcRealm();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the AuthenticationInfo buildAuthenticationInfo(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testBuildAuthenticationInfo_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		String username = "";
		char[] password = new char[] {};

		AuthenticationInfo result = fixture.buildAuthenticationInfo(username, password);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AccountException.class)
	public void testDoGetAuthenticationInfo_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		AuthenticationToken token = new UsernamePasswordToken((String) null, new char[] {}, true, InetAddress.getLocalHost());

		AuthenticationInfo result = fixture.doGetAuthenticationInfo(token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoGetAuthorizationInfo_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testDoGetAuthorizationInfo_2()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		PrincipalCollection principals = null;

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testDoGetAuthorizationInfo_3()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testDoGetAuthorizationInfo_4()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testDoGetAuthorizationInfo_5()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetPermissions_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetPermissions_2()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetPermissions_3()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_4()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_5()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_6()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_7()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_8()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getPermissions(Connection,String,Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetPermissions_9()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";
		Collection<String> roleNames = new Vector();

		Set<String> result = fixture.getPermissions(conn, username, roleNames);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRoleNamesForUser_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRoleNamesForUser_2()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRoleNamesForUser_3()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_4()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_5()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_6()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_7()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_8()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoleNamesForUser(Connection,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.sql.SQLException.class)
	public void testGetRoleNamesForUser_9()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		Connection conn = new jdbcConnection(new HsqlProperties(""));
		String username = "";

		Set<String> result = fixture.getRoleNamesForUser(conn, username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAuthenticationQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetAuthenticationQuery_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		String authenticationQuery = "";

		fixture.setAuthenticationQuery(authenticationQuery);

		// add additional test code here
	}

	/**
	 * Run the void setDataSource(DataSource) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetDataSource_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		DataSource dataSource = new IsolationLevelDataSourceRouter();

		fixture.setDataSource(dataSource);

		// add additional test code here
	}

	/**
	 * Run the void setPermissionsLookupEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetPermissionsLookupEnabled_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		boolean permissionsLookupEnabled = true;

		fixture.setPermissionsLookupEnabled(permissionsLookupEnabled);

		// add additional test code here
	}

	/**
	 * Run the void setPermissionsQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetPermissionsQuery_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		String permissionsQuery = "";

		fixture.setPermissionsQuery(permissionsQuery);

		// add additional test code here
	}

	/**
	 * Run the void setUserRolesQuery(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetUserRolesQuery_1()
		throws Exception {
		JdbcRealm fixture = new JdbcRealm();
		fixture.setPermissionsLookupEnabled(true);
		fixture.setAuthenticationQuery("");
		fixture.setUserRolesQuery("");
		fixture.setPermissionsQuery("");
		fixture.setDataSource(new IsolationLevelDataSourceRouter());
		String userRolesQuery = "";

		fixture.setUserRolesQuery(userRolesQuery);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JdbcRealmTest.class);
	}
}