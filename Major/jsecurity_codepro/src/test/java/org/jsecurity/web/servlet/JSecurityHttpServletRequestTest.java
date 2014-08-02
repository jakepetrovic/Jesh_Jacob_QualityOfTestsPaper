package org.jsecurity.web.servlet;

import java.security.Principal;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.subject.Subject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JSecurityHttpServletRequestTest</code> contains tests for the class <code>{@link JSecurityHttpServletRequest}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JSecurityHttpServletRequestTest {
	/**
	 * Run the JSecurityHttpServletRequest(HttpServletRequest,ServletContext,boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testJSecurityHttpServletRequest_1()
		throws Exception {
		HttpServletRequest wrapped = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletContext servletContext = null;
		boolean httpSessions = true;

		JSecurityHttpServletRequest result = new JSecurityHttpServletRequest(wrapped, servletContext, httpSessions);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/servlet/JSecurityHttpServletRequest : Unsupported major.minor version 51.0
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
	 * Run the String getRemoteUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRemoteUser_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRemoteUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRemoteUser_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRemoteUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRemoteUser_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRemoteUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRemoteUser() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRemoteUser_4()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRemoteUser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestedSessionId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRequestedSessionId_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRequestedSessionId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestedSessionId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRequestedSessionId_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRequestedSessionId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRequestedSessionId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetRequestedSessionId_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getRequestedSessionId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		HttpSession result = fixture.getSession();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = null;
		boolean create = true;

		HttpSession result = fixture.getSession(create);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = null;
		boolean create = true;

		HttpSession result = fixture.getSession(create);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_4()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = null;
		boolean create = true;

		HttpSession result = fixture.getSession(create);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_5()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		boolean create = true;

		HttpSession result = fixture.getSession(create);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSession getSession(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSession_6()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		boolean create = true;

		HttpSession result = fixture.getSession(create);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject getSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Subject result = fixture.getSubject();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getSubjectPrincipal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSubjectPrincipal_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Object result = fixture.getSubjectPrincipal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getSubjectPrincipal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetSubjectPrincipal_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Object result = fixture.getSubjectPrincipal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Principal getUserPrincipal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUserPrincipal_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Principal result = fixture.getUserPrincipal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Principal getUserPrincipal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUserPrincipal_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Principal result = fixture.getUserPrincipal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Principal getUserPrincipal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testGetUserPrincipal_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Principal result = fixture.getUserPrincipal();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isHttpSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsHttpSessions_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isHttpSessions();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isHttpSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsHttpSessions_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isHttpSessions();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromCookie() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromCookie_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromCookie();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromCookie() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromCookie_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromCookie();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromCookie() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromCookie_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromCookie();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromCookie() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromCookie_4()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromCookie();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromCookie() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromCookie_5()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromCookie();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromURL_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromURL();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromURL_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromURL();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromURL_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromURL();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromURL_4()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromURL();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromURL() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromURL_5()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromURL();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromUrl_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromUrl();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdFromUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdFromUrl_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdFromUrl();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdValid_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdValid_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdValid_3()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdValid_4()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRequestedSessionIdValid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsRequestedSessionIdValid_5()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, false);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isRequestedSessionIdValid();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUserInRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsUserInRole_1()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		boolean result = fixture.isUserInRole(s);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUserInRole(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testIsUserInRole_2()
		throws Exception {
		JSecurityHttpServletRequest fixture = new JSecurityHttpServletRequest(new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null, true);
		fixture.session = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		boolean result = fixture.isUserInRole(s);

		// add additional test code here
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(JSecurityHttpServletRequestTest.class);
	}
}