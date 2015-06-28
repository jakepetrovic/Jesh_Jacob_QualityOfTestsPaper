package org.jsecurity.web.session;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.jsecurity.web.servlet.JSecurityHttpSession;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ServletContainerSessionManagerTest</code> contains tests for the class <code>{@link ServletContainerSessionManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:09 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ServletContainerSessionManagerTest {
	/**
	 * Run the ServletContainerSessionManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testServletContainerSessionManager_1()
		throws Exception {

		ServletContainerSessionManager result = new ServletContainerSessionManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/session/ServletContainerSessionManager : Unsupported major.minor version 51.0
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
	 * Run the Session createSession(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testCreateSession_1()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Session result = fixture.createSession(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session createSession(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateSession_2()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Session result = fixture.createSession(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session createSession(HttpSession,InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testCreateSession_3()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		HttpSession httpSession = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		InetAddress inet = InetAddress.getLocalHost();

		Session result = fixture.createSession(httpSession, inet);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testDoGetSession_1()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		Serializable sessionId = new IOException();

		Session result = fixture.doGetSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoGetSession_2()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		Serializable sessionId = new IOException();

		Session result = fixture.doGetSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoGetSession_3()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		Serializable sessionId = new IOException();

		Session result = fixture.doGetSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testDoGetSession_4()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		Serializable sessionId = new IOException();

		Session result = fixture.doGetSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testGetSession_1()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.getSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	@Test
	public void testGetSession_2()
		throws Exception {
		ServletContainerSessionManager fixture = new ServletContainerSessionManager();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.getSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:09 PM
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
	 * @generatedBy CodePro at 4/19/14 3:09 PM
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
	 * @generatedBy CodePro at 4/19/14 3:09 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServletContainerSessionManagerTest.class);
	}
}