package org.jsecurity.authz;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import org.jsecurity.authz.permission.AllPermission;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleAuthorizationInfoTest</code> contains tests for the class <code>{@link SimpleAuthorizationInfo}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleAuthorizationInfoTest {
	/**
	 * Run the SimpleAuthorizationInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSimpleAuthorizationInfo_1()
		throws Exception {

		SimpleAuthorizationInfo result = new SimpleAuthorizationInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizationInfo : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizationInfo(Set<String>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSimpleAuthorizationInfo_2()
		throws Exception {
		Set<String> roles = new HashSet();

		SimpleAuthorizationInfo result = new SimpleAuthorizationInfo(roles);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizationInfo : Unsupported major.minor version 51.0
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
	 * Run the void addObjectPermission(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddObjectPermission_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(null);
		Permission permission = new AllPermission();

		fixture.addObjectPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void addObjectPermission(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddObjectPermission_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Permission permission = new AllPermission();

		fixture.addObjectPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void addObjectPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddObjectPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(null);
		Collection<Permission> permissions = new Vector();

		fixture.addObjectPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void addObjectPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddObjectPermissions_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Collection<Permission> permissions = new Vector();

		fixture.addObjectPermissions(permissions);

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
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo((Set<String>) null);
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		String role = "";

		fixture.addRole(role);

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
	public void testAddRole_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		String role = "";

		fixture.addRole(role);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddRoles_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo((Set<String>) null);
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Collection<String> roles = new Vector();

		fixture.addRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddRoles_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Collection<String> roles = new Vector();

		fixture.addRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void addStringPermission(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddStringPermission_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(null);
		fixture.setObjectPermissions(new HashSet());
		String permission = "";

		fixture.addStringPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void addStringPermission(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddStringPermission_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		String permission = "";

		fixture.addStringPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void addStringPermissions(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddStringPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(null);
		fixture.setObjectPermissions(new HashSet());
		Collection<String> permissions = new Vector();

		fixture.addStringPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void addStringPermissions(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAddStringPermissions_2()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Collection<String> permissions = new Vector();

		fixture.addStringPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the Set<Permission> getObjectPermissions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetObjectPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());

		Set<Permission> result = fixture.getObjectPermissions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRoles_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());

		Set<String> result = fixture.getRoles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getStringPermissions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetStringPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());

		Set<String> result = fixture.getStringPermissions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setObjectPermissions(Set<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetObjectPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Set<Permission> objectPermissions = new HashSet();

		fixture.setObjectPermissions(objectPermissions);

		// add additional test code here
	}

	/**
	 * Run the void setRoles(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetRoles_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Set<String> roles = new HashSet();

		fixture.setRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void setStringPermissions(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetStringPermissions_1()
		throws Exception {
		SimpleAuthorizationInfo fixture = new SimpleAuthorizationInfo(new HashSet());
		fixture.setStringPermissions(new HashSet());
		fixture.setObjectPermissions(new HashSet());
		Set<String> stringPermissions = new HashSet();

		fixture.setStringPermissions(stringPermissions);

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
		new org.junit.runner.JUnitCore().run(SimpleAuthorizationInfoTest.class);
	}
}