package org.jsecurity.authc;

import java.util.Vector;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SimpleAuthenticationInfoTest</code> contains tests for the class <code>{@link SimpleAuthenticationInfo}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SimpleAuthenticationInfoTest {
	/**
	 * Run the SimpleAuthenticationInfo() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSimpleAuthenticationInfo_1()
		throws Exception {

		SimpleAuthenticationInfo result = new SimpleAuthenticationInfo();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthenticationInfo(PrincipalCollection,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSimpleAuthenticationInfo_2()
		throws Exception {
		PrincipalCollection principals = new SimplePrincipalCollection();
		Object credentials = new Object();

		SimpleAuthenticationInfo result = new SimpleAuthenticationInfo(principals, credentials);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
	 * Run the SimpleAuthenticationInfo(Object,Object,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSimpleAuthenticationInfo_3()
		throws Exception {
		Object principal = new Object();
		Object credentials = new Object();
		String realmName = "";

		SimpleAuthenticationInfo result = new SimpleAuthenticationInfo(principal, credentials, realmName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		SimpleAuthenticationInfo o = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		o.setPrincipals(new SimplePrincipalCollection());

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		Object o = new Object();

		boolean result = fixture.equals(o);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		SimpleAuthenticationInfo o = new SimpleAuthenticationInfo();
		o.setPrincipals(new SimplePrincipalCollection());

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		SimpleAuthenticationInfo o = new SimpleAuthenticationInfo();
		o.setPrincipals(new SimplePrincipalCollection());

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals((PrincipalCollection) null);
		SimpleAuthenticationInfo o = new SimpleAuthenticationInfo();
		o.setPrincipals((PrincipalCollection) null);

		boolean result = fixture.equals(o);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/SimpleAuthenticationInfo : Unsupported major.minor version 51.0
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
		assertTrue(result);
	}

	/**
	 * Run the Object getCredentials() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());

		Object result = fixture.getCredentials();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetPrincipals_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());

		PrincipalCollection result = fixture.getPrincipals();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals((PrincipalCollection) null);

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testHashCode_2()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());

		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_2()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_3()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals((PrincipalCollection) null);
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_4()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), (Object) null);
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_5()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_6()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_7()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals((PrincipalCollection) null);
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_8()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_9()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_10()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals((PrincipalCollection) null);
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_11()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_12()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_13()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals((PrincipalCollection) null);
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_14()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_15()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals(new SimplePrincipalCollection());
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void merge(AuthenticationInfo) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testMerge_16()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Vector());
		fixture.setPrincipals((PrincipalCollection) null);
		AuthenticationInfo info = new SimpleAccount();

		fixture.merge(info);

		// add additional test code here
	}

	/**
	 * Run the void setCredentials(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		Object credentials = new Object();

		fixture.setCredentials(credentials);

		// add additional test code here
	}

	/**
	 * Run the void setPrincipals(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetPrincipals_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.setPrincipals(principals);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		SimpleAuthenticationInfo fixture = new SimpleAuthenticationInfo(new SimplePrincipalCollection(), new Object());
		fixture.setPrincipals(new SimplePrincipalCollection());

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
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
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(SimpleAuthenticationInfoTest.class);
	}
}