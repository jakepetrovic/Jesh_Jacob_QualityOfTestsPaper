package org.jsecurity.realm;

import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.ExpiredCredentialsException;
import org.jsecurity.authc.LockedAccountException;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.authz.AuthorizationInfo;
import org.jsecurity.authz.SimpleRole;
import org.jsecurity.cache.CacheException;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleAccountRealmTest</code> contains tests for the class <code>{@link SimpleAccountRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleAccountRealmTest {
	/**
	 * Run the SimpleAccountRealm() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSimpleAccountRealm_1()
		throws Exception {

		SimpleAccountRealm result = new SimpleAccountRealm();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/SimpleAccountRealm : Unsupported major.minor version 51.0
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
	 * Run the SimpleAccountRealm(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSimpleAccountRealm_2()
		throws Exception {
		String name = "";

		SimpleAccountRealm result = new SimpleAccountRealm(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/SimpleAccountRealm : Unsupported major.minor version 51.0
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
	 * Run the void accountAndRoleCachesCreated() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAccountAndRoleCachesCreated_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();

		fixture.accountAndRoleCachesCreated();

		// add additional test code here
	}

	/**
	 * Run the boolean accountExists(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAccountExists_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";

		boolean result = fixture.accountExists(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean accountExists(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAccountExists_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";

		boolean result = fixture.accountExists(username);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void add(SimpleAccount) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		SimpleAccount account = new SimpleAccount();

		fixture.add(account);

		// add additional test code here
	}

	/**
	 * Run the void add(SimpleAccount) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testAdd_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		SimpleAccount account = new SimpleAccount();

		fixture.add(account);

		// add additional test code here
	}

	/**
	 * Run the void add(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		SimpleRole role = new SimpleRole();
		role.setName("");

		fixture.add(role);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleRole : Unsupported major.minor version 51.0
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
		//       at com.instantiations.eclipse.analysis.expression.model.VariableAccessExpression.assign(VariableAccessExpression.java:295)
		//       at com.instantiations.eclipse.analysis.expression.model.AssignmentExpression.execute(AssignmentExpression.java:200)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Thread.java:695)
	}

	/**
	 * Run the void addAccount(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddAccount_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";
		String password = "";

		fixture.addAccount(username, password);

		// add additional test code here
	}

	/**
	 * Run the void addAccount(String,String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddAccount_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";
		String password = "";

		fixture.addAccount(username, password);

		// add additional test code here
	}

	/**
	 * Run the void addRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddRole_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String name = "";

		fixture.addRole(name);

		// add additional test code here
	}

	/**
	 * Run the void afterAuthorizationCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAfterAuthorizationCacheSet_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();

		fixture.afterAuthorizationCacheSet();

		// add additional test code here
	}

	/**
	 * Run the void afterRoleCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAfterRoleCacheSet_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();

		fixture.afterRoleCacheSet();

		// add additional test code here
	}

	/**
	 * Run the AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoGetAuthenticationInfo_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		AuthenticationToken token = new UsernamePasswordToken("", new char[] {}, true, InetAddress.getLocalHost());

		AuthenticationInfo result = fixture.doGetAuthenticationInfo(token);

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
	@Test(expected = org.jsecurity.authc.ExpiredCredentialsException.class)
	public void testDoGetAuthenticationInfo_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		AuthenticationToken token = new UsernamePasswordToken("", new char[] {}, true, InetAddress.getLocalHost());

		AuthenticationInfo result = fixture.doGetAuthenticationInfo(token);

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
	@Test(expected = org.jsecurity.authc.LockedAccountException.class)
	public void testDoGetAuthenticationInfo_3()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		AuthenticationToken token = new UsernamePasswordToken("", new char[] {}, true, InetAddress.getLocalHost());

		AuthenticationInfo result = fixture.doGetAuthenticationInfo(token);

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
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testDoGetAuthenticationInfo_4()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		AuthenticationToken token = new UsernamePasswordToken("", new char[] {}, true, InetAddress.getLocalHost());

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
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
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
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testDoGetAuthorizationInfo_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		PrincipalCollection principals = new SimplePrincipalCollection();

		AuthorizationInfo result = fixture.doGetAuthorizationInfo(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAuthorizationCacheKey(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetAuthorizationCacheKey_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		PrincipalCollection principals = new SimplePrincipalCollection();

		Object result = fixture.getAuthorizationCacheKey(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String rolename = "";

		SimpleRole result = fixture.getRole(rolename);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleAccount getUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUser_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";

		SimpleAccount result = fixture.getUser(username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleAccount getUser(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetUser_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String username = "";

		SimpleAccount result = fixture.getUser(username);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initRoleCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testInitRoleCache_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();

		fixture.initRoleCache();

		// add additional test code here
	}

	/**
	 * Run the void initRoleCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testInitRoleCache_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();

		fixture.initRoleCache();

		// add additional test code here
	}

	/**
	 * Run the boolean roleExists(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRoleExists_1()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String name = "";

		boolean result = fixture.roleExists(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean roleExists(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testRoleExists_2()
		throws Exception {
		SimpleAccountRealm fixture = new SimpleAccountRealm();
		fixture.roles = new LinkedHashMap();
		String name = "";

		boolean result = fixture.roleExists(name);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Set<String> toSet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToSet_1()
		throws Exception {
		String delimited = null;
		String delimiter = "";

		Set<String> result = SimpleAccountRealm.toSet(delimited, delimiter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toSet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToSet_2()
		throws Exception {
		String delimited = "";
		String delimiter = "";

		Set<String> result = SimpleAccountRealm.toSet(delimited, delimiter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toSet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToSet_3()
		throws Exception {
		String delimited = "";
		String delimiter = "";

		Set<String> result = SimpleAccountRealm.toSet(delimited, delimiter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toSet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToSet_4()
		throws Exception {
		String delimited = "";
		String delimiter = "";

		Set<String> result = SimpleAccountRealm.toSet(delimited, delimiter);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> toSet(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testToSet_5()
		throws Exception {
		String delimited = "";
		String delimiter = "";

		Set<String> result = SimpleAccountRealm.toSet(delimited, delimiter);

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(SimpleAccountRealmTest.class);
	}
}