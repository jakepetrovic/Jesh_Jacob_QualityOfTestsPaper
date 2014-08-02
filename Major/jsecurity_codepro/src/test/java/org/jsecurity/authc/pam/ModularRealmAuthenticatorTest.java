package org.jsecurity.authc.pam;

import java.util.Collection;
import java.util.List;
import java.util.Vector;
import org.jsecurity.authc.AbstractAuthenticator;
import org.jsecurity.authc.AuthenticationException;
import org.jsecurity.authc.AuthenticationInfo;
import org.jsecurity.authc.AuthenticationListener;
import org.jsecurity.authc.AuthenticationToken;
import org.jsecurity.authc.UnknownAccountException;
import org.jsecurity.authc.UsernamePasswordToken;
import org.jsecurity.realm.Realm;
import org.jsecurity.realm.SimpleAccountRealm;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ModularRealmAuthenticatorTest</code> contains tests for the class <code>{@link ModularRealmAuthenticator}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ModularRealmAuthenticatorTest {
	/**
	 * Run the ModularRealmAuthenticator() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testModularRealmAuthenticator_1()
		throws Exception {

		ModularRealmAuthenticator result = new ModularRealmAuthenticator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/pam/ModularRealmAuthenticator : Unsupported major.minor version 51.0
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
	 * Run the ModularRealmAuthenticator(List<Realm>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testModularRealmAuthenticator_2()
		throws Exception {
		List<Realm> realms = new Vector();

		ModularRealmAuthenticator result = new ModularRealmAuthenticator(realms);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/pam/ModularRealmAuthenticator : Unsupported major.minor version 51.0
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
	 * Run the ModularRealmAuthenticator(Realm) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testModularRealmAuthenticator_3()
		throws Exception {
		Realm realm = new SimpleAccountRealm();

		ModularRealmAuthenticator result = new ModularRealmAuthenticator(realm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/authc/pam/ModularRealmAuthenticator : Unsupported major.minor version 51.0
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
	 * Run the void assertRealmsConfigured() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAssertRealmsConfigured_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);

		fixture.assertRealmsConfigured();

		// add additional test code here
	}

	/**
	 * Run the void assertRealmsConfigured() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testAssertRealmsConfigured_2()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(null);
		fixture.add((AuthenticationListener) null);

		fixture.assertRealmsConfigured();

		// add additional test code here
	}

	/**
	 * Run the void assertRealmsConfigured() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testAssertRealmsConfigured_3()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);

		fixture.assertRealmsConfigured();

		// add additional test code here
	}

	/**
	 * Run the AuthenticationInfo doAuthenticate(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoAuthenticate_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		AuthenticationToken authenticationToken = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doAuthenticate(authenticationToken);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doAuthenticate(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoAuthenticate_2()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		AuthenticationToken authenticationToken = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doAuthenticate(authenticationToken);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doAuthenticate(AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoAuthenticate_3()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		AuthenticationToken authenticationToken = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doAuthenticate(authenticationToken);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoMultiRealmAuthentication_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoMultiRealmAuthentication_2()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoMultiRealmAuthentication_3()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoMultiRealmAuthentication_4()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoMultiRealmAuthentication_5()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoMultiRealmAuthentication_6()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doMultiRealmAuthentication(Collection<Realm>,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoMultiRealmAuthentication_7()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doMultiRealmAuthentication(realms, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doSingleRealmAuthentication(Realm,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testDoSingleRealmAuthentication_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Realm realm = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doSingleRealmAuthentication(realm, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doSingleRealmAuthentication(Realm,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.AuthenticationException.class)
	public void testDoSingleRealmAuthentication_2()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Realm realm = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doSingleRealmAuthentication(realm, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doSingleRealmAuthentication(Realm,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.UnknownAccountException.class)
	public void testDoSingleRealmAuthentication_3()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Realm realm = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doSingleRealmAuthentication(realm, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the AuthenticationInfo doSingleRealmAuthentication(Realm,AuthenticationToken) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test(expected = org.jsecurity.authc.pam.UnsupportedTokenException.class)
	public void testDoSingleRealmAuthentication_4()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Realm realm = new SimpleAccountRealm();
		AuthenticationToken token = new UsernamePasswordToken();

		AuthenticationInfo result = fixture.doSingleRealmAuthentication(realm, token);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the ModularAuthenticationStrategy getModularAuthenticationStrategy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetModularAuthenticationStrategy_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);

		ModularAuthenticationStrategy result = fixture.getModularAuthenticationStrategy();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Realm> getRealms() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRealms_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);

		Collection<Realm> result = fixture.getRealms();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLogout_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLogout_2()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLogout_3()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLogout_4()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(null);
		fixture.add((AuthenticationListener) null);
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void onLogout(PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testOnLogout_5()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		PrincipalCollection principals = new SimplePrincipalCollection();

		fixture.onLogout(principals);

		// add additional test code here
	}

	/**
	 * Run the void setModularAuthenticationStrategy(ModularAuthenticationStrategy) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetModularAuthenticationStrategy_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		ModularAuthenticationStrategy modularAuthenticationStrategy = new AllSuccessfulModularAuthenticationStrategy();

		fixture.setModularAuthenticationStrategy(modularAuthenticationStrategy);

		// add additional test code here
	}

	/**
	 * Run the void setRealm(Realm) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetRealm_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Realm realm = new SimpleAccountRealm();

		fixture.setRealm(realm);

		// add additional test code here
	}

	/**
	 * Run the void setRealms(Collection<Realm>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testSetRealms_1()
		throws Exception {
		ModularRealmAuthenticator fixture = new ModularRealmAuthenticator();
		fixture.setModularAuthenticationStrategy(new AllSuccessfulModularAuthenticationStrategy());
		fixture.setRealms(new Vector());
		fixture.add((AuthenticationListener) null);
		Collection<Realm> realms = new Vector();

		fixture.setRealms(realms);

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
		new org.junit.runner.JUnitCore().run(ModularRealmAuthenticatorTest.class);
	}
}