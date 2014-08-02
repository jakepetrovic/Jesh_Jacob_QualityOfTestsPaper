package org.jsecurity.spring.remoting;

import java.net.InetAddress;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.subject.PrincipalCollection;
import org.jsecurity.subject.SimplePrincipalCollection;
import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.remoting.support.RemoteInvocation;

/**
 * The class <code>SecureRemoteInvocationExecutorTest</code> contains tests for the class <code>{@link SecureRemoteInvocationExecutor}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:11 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SecureRemoteInvocationExecutorTest {
	/**
	 * Run the SecureRemoteInvocationExecutor() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSecureRemoteInvocationExecutor_1()
		throws Exception {
		SecureRemoteInvocationExecutor result = new SecureRemoteInvocationExecutor();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the InetAddress getInetAddress(RemoteInvocation,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetInetAddress_1()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();

		InetAddress result = fixture.getInetAddress(invocation, targetObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getInetAddress(RemoteInvocation,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetInetAddress_2()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();

		InetAddress result = fixture.getInetAddress(invocation, targetObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(RemoteInvocation,Object,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testGetPrincipals_1()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());

		PrincipalCollection result = fixture.getPrincipals(invocation, targetObject, session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PrincipalCollection getPrincipals(RemoteInvocation,Object,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetPrincipals_2()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());

		PrincipalCollection result = fixture.getPrincipals(invocation, targetObject, session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(RemoteInvocation,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testInvoke_1()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();

		Object result = fixture.invoke(invocation, targetObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(RemoteInvocation,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testInvoke_2()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();

		Object result = fixture.invoke(invocation, targetObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object invoke(RemoteInvocation,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testInvoke_3()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();

		Object result = fixture.invoke(invocation, targetObject);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAuthenticated(RemoteInvocation,Object,Session,PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAuthenticated_1()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());
		PrincipalCollection principals = new SimplePrincipalCollection();

		boolean result = fixture.isAuthenticated(invocation, targetObject, session, principals);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(RemoteInvocation,Object,Session,PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAuthenticated_2()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());
		PrincipalCollection principals = new SimplePrincipalCollection();

		boolean result = fixture.isAuthenticated(invocation, targetObject, session, principals);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(RemoteInvocation,Object,Session,PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAuthenticated_3()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());
		PrincipalCollection principals = new SimplePrincipalCollection();

		boolean result = fixture.isAuthenticated(invocation, targetObject, session, principals);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(RemoteInvocation,Object,Session,PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testIsAuthenticated_4()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());
		PrincipalCollection principals = null;

		boolean result = fixture.isAuthenticated(invocation, targetObject, session, principals);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isAuthenticated(RemoteInvocation,Object,Session,PrincipalCollection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testIsAuthenticated_5()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		RemoteInvocation invocation = new RemoteInvocation();
		Object targetObject = new Object();
		Session session = new ProxiedSession(new DelegatingSession());
		PrincipalCollection principals = new SimplePrincipalCollection();

		boolean result = fixture.isAuthenticated(invocation, targetObject, session, principals);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setSecurityManager(SecurityManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:11 PM
	 */
	@Test
	public void testSetSecurityManager_1()
		throws Exception {
		SecureRemoteInvocationExecutor fixture = new SecureRemoteInvocationExecutor();
		fixture.setSecurityManager(new DefaultSecurityManager());
		SecurityManager securityManager = new DefaultSecurityManager();

		fixture.setSecurityManager(securityManager);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SecureRemoteInvocationExecutorTest.class);
	}
}