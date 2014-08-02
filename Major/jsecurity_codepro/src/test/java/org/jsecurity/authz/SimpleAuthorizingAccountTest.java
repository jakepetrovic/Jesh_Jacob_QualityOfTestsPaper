package org.jsecurity.authz;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import org.jsecurity.authc.Account;
import org.jsecurity.authc.SimpleAccount;
import org.jsecurity.authz.permission.AllPermission;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleAuthorizingAccountTest</code> contains tests for the class <code>{@link SimpleAuthorizingAccount}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:23 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleAuthorizingAccountTest {
	/**
	 * Run the SimpleAuthorizingAccount() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_1()
		throws Exception {

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(PrincipalCollection,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_2()
		throws Exception {
		PrincipalCollection principals = new SimplePrincipalCollection();
		Object credentials = new Object();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Object,Object,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_3()
		throws Exception {
		Object principal = new Object();
		Object credentials = new Object();
		String realmName = "";

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principal, credentials, realmName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Collection,Object,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_4()
		throws Exception {
		Collection principals = new Vector();
		Object credentials = new Object();
		String realmName = "";

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Object,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_5()
		throws Exception {
		Object principal = new Object();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principal, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Object,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_6()
		throws Exception {
		Object principal = new Object();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = null;

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principal, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Object,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_7()
		throws Exception {
		Object principal = new Object();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principal, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Collection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_8()
		throws Exception {
		Collection principals = new Vector();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Collection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_9()
		throws Exception {
		Collection principals = new Vector();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = null;

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(Collection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_10()
		throws Exception {
		Collection principals = new Vector();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(PrincipalCollection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_11()
		throws Exception {
		PrincipalCollection principals = new SimplePrincipalCollection();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(PrincipalCollection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_12()
		throws Exception {
		PrincipalCollection principals = new SimplePrincipalCollection();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = null;

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthorizingAccount(PrincipalCollection,Object,String,Set<String>,Set<Permission>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSimpleAuthorizingAccount_13()
		throws Exception {
		PrincipalCollection principals = new SimplePrincipalCollection();
		Object credentials = new Object();
		String realmName = "";
		Set<String> roleNames = new HashSet();
		Set<Permission> permissions = new HashSet();

		SimpleAuthorizingAccount result = new SimpleAuthorizingAccount(principals, credentials, realmName, roleNames, permissions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authz/SimpleAuthorizingAccount : Unsupported major.minor version 51.0
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
	 * Run the void add(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(null);
		SimpleRole role = new SimpleRole();

		fixture.add(role);

		// add additional test code here
	}

	/**
	 * Run the void add(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		SimpleRole role = new SimpleRole();

		fixture.add(role);

		// add additional test code here
	}

	/**
	 * Run the void addAll(Collection<SimpleRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddAll_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(null);
		Collection<SimpleRole> roles = new Vector();

		fixture.addAll(roles);

		// add additional test code here
	}

	/**
	 * Run the void addAll(Collection<SimpleRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddAll_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<SimpleRole> roles = new Vector();

		fixture.addAll(roles);

		// add additional test code here
	}

	/**
	 * Run the void addAll(Collection<SimpleRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddAll_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<SimpleRole> roles = null;

		fixture.addAll(roles);

		// add additional test code here
	}

	/**
	 * Run the void addAll(Collection<SimpleRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddAll_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<SimpleRole> roles = new Vector();

		fixture.addAll(roles);

		// add additional test code here
	}

	/**
	 * Run the void addPrivateRole(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddPrivateRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		PrincipalCollection principals = new SimplePrincipalCollection();
		Collection<Permission> perms = new Vector();

		fixture.addPrivateRole(principals, perms);

		// add additional test code here
	}

	/**
	 * Run the void addPrivateRole(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddPrivateRole_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		PrincipalCollection principals = new SimplePrincipalCollection();
		Collection<Permission> perms = null;

		fixture.addPrivateRole(principals, perms);

		// add additional test code here
	}

	/**
	 * Run the void addPrivateRole(PrincipalCollection,Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddPrivateRole_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		PrincipalCollection principals = new SimplePrincipalCollection();
		Collection<Permission> perms = new Vector();

		fixture.addPrivateRole(principals, perms);

		// add additional test code here
	}

	/**
	 * Run the void addRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String roleName = "";

		fixture.addRole(roleName);

		// add additional test code here
	}

	/**
	 * Run the void addRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRole_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String roleName = "";

		fixture.addRole(roleName);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Set<String> roleNames = new HashSet();

		fixture.addRoles(roleNames);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRoles_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Set<String> roleNames = new HashSet();

		fixture.addRoles(roleNames);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRoles_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Set<String> roleNames = null;

		fixture.addRoles(roleNames);

		// add additional test code here
	}

	/**
	 * Run the void addRoles(Set<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testAddRoles_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Set<String> roleNames = new HashSet();

		fixture.addRoles(roleNames);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckPermission_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		fixture.checkPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void checkPermission(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testCheckPermission_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		fixture.checkPermission(permission);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckPermissions_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		fixture.checkPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckPermissions_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		fixture.checkPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckPermissions_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = null;

		fixture.checkPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckPermissions_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		fixture.checkPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkPermissions(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testCheckPermissions_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		fixture.checkPermissions(permissions);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String role = "";

		fixture.checkRole(role);

		// add additional test code here
	}

	/**
	 * Run the void checkRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.authz.UnauthorizedException.class)
	public void testCheckRole_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String role = "";

		fixture.checkRole(role);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roles = new Vector();

		fixture.checkRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckRoles_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roles = new Vector();

		fixture.checkRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckRoles_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roles = null;

		fixture.checkRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the void checkRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCheckRoles_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roles = new Vector();

		fixture.checkRoles(roles);

		// add additional test code here
	}

	/**
	 * Run the SimpleRole createPrivateRole(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testCreatePrivateRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		PrincipalCollection principals = new SimplePrincipalCollection();

		SimpleRole result = fixture.createPrivateRole(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Permission> getPermissions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetPermissions_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());

		Set<Permission> result = fixture.getPermissions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Permission> getPermissions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetPermissions_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());

		Set<Permission> result = fixture.getPermissions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getPrivateRoleName(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetPrivateRoleName_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		PrincipalCollection principals = new SimplePrincipalCollection();

		String result = fixture.getPrivateRoleName(principals);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String name = "";

		SimpleRole result = fixture.getRole(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRole_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String name = "";

		SimpleRole result = fixture.getRole(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRole_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String name = "";

		SimpleRole result = fixture.getRole(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRole_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(null);
		String name = "";

		SimpleRole result = fixture.getRole(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SimpleRole getRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRole_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String name = "";

		SimpleRole result = fixture.getRole(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRolenames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRolenames_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());

		Set<String> result = fixture.getRolenames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getRolenames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetRolenames_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());

		Set<String> result = fixture.getRolenames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<SimpleRole> getSimpleRoles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetSimpleRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());

		Set<SimpleRole> result = fixture.getSimpleRoles();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasAllRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasAllRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasAllRoles_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasAllRoles_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasAllRoles_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roleIdentifiers = null;

		boolean result = fixture.hasAllRoles(roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasAllRoles(Collection<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasAllRoles_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<String> roleIdentifiers = new Vector();

		boolean result = fixture.hasAllRoles(roleIdentifiers);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRole_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String roleName = "";

		boolean result = fixture.hasRole(roleName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRole_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		String roleName = "";

		boolean result = fixture.hasRole(roleName);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<String> roleIdentifiers = null;

		boolean[] result = fixture.hasRoles(roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRoles_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<String> roleIdentifiers = new Vector();

		boolean[] result = fixture.hasRoles(roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRoles_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<String> roleIdentifiers = new Vector();

		boolean[] result = fixture.hasRoles(roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] hasRoles(List<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testHasRoles_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<String> roleIdentifiers = new Vector();

		boolean[] result = fixture.hasRoles(roleIdentifiers);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<Permission> permissions = null;

		boolean[] result = fixture.isPermitted(permissions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<Permission> permissions = new Vector();

		boolean[] result = fixture.isPermitted(permissions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<Permission> permissions = new Vector();

		boolean[] result = fixture.isPermitted(permissions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean[] isPermitted(List<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		List<Permission> permissions = new Vector();

		boolean[] result = fixture.isPermitted(permissions);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPermitted(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_6()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_7()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_8()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(null);
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermitted(Permission) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermitted_9()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Permission permission = new AllPermission();

		boolean result = fixture.isPermitted(permission);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermittedAll_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermittedAll_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermittedAll_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermittedAll_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = null;

		boolean result = fixture.isPermittedAll(permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isPermittedAll(Collection<Permission>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testIsPermittedAll_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Collection<Permission> permissions = new Vector();

		boolean result = fixture.isPermittedAll(permissions);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void merge(Account) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Account otherAccount = new SimpleAuthorizingAccount();

		fixture.merge(otherAccount);

		// add additional test code here
	}

	/**
	 * Run the void merge(Account) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_2()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Account otherAccount = new SimpleAuthorizingAccount();

		fixture.merge(otherAccount);

		// add additional test code here
	}

	/**
	 * Run the void merge(Account) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_3()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(null);
		Account otherAccount = new SimpleAuthorizingAccount();

		fixture.merge(otherAccount);

		// add additional test code here
	}

	/**
	 * Run the void merge(Account) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_4()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Account otherAccount = new SimpleAuthorizingAccount();

		fixture.merge(otherAccount);

		// add additional test code here
	}

	/**
	 * Run the void merge(Account) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_5()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Account otherAccount = new SimpleAccount();

		fixture.merge(otherAccount);

		// add additional test code here
	}

	/**
	 * Run the void merge(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_6()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		SimpleRole role = new SimpleRole();
		role.setName("");

		fixture.merge(role);

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
	 * Run the void merge(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_7()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		SimpleRole role = new SimpleRole();
		role.setName("");
		role.setPermissions(new HashSet());

		fixture.merge(role);

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
	 * Run the void merge(SimpleRole) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testMerge_8()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		SimpleRole role = new SimpleRole();
		role.setName("");
		role.setPermissions(new HashSet());

		fixture.merge(role);

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
	 * Run the void setSimpleRoles(Set<SimpleRole>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetSimpleRoles_1()
		throws Exception {
		SimpleAuthorizingAccount fixture = new SimpleAuthorizingAccount();
		fixture.setSimpleRoles(new HashSet());
		Set<SimpleRole> simpleRoles = new HashSet();

		fixture.setSimpleRoles(simpleRoles);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
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
	 * @generatedBy CodePro at 4/19/14 3:23 PM
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
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleAuthorizingAccountTest.class);
	}
}