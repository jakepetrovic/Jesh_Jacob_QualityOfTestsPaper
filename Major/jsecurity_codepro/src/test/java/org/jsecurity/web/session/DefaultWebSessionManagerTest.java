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
import org.jsecurity.authz.AuthorizationException;
import org.jsecurity.authz.HostUnauthorizedException;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.web.attr.CookieAttribute;
import org.jsecurity.web.attr.RequestParamAttribute;
import org.jsecurity.web.servlet.JSecurityHttpServletRequest;
import org.jsecurity.web.servlet.JSecurityHttpServletResponse;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultWebSessionManagerTest</code> contains tests for the class <code>{@link DefaultWebSessionManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:34 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DefaultWebSessionManagerTest {
	/**
	 * Run the DefaultWebSessionManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testDefaultWebSessionManager_1()
		throws Exception {

		DefaultWebSessionManager result = new DefaultWebSessionManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/session/DefaultWebSessionManager : Unsupported major.minor version 51.0
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
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testDoGetSession_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testDoGetSession_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testDoGetSession_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(false);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testDoGetSession_4()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testDoGetSession_5()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doGetSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testDoGetSession_6()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.doGetSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void ensureCookieSessionIdStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testEnsureCookieSessionIdStore_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(null);
		fixture.setValidateRequestOrigin(true);

		fixture.ensureCookieSessionIdStore();

		// add additional test code here
	}

	/**
	 * Run the void ensureCookieSessionIdStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testEnsureCookieSessionIdStore_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		fixture.ensureCookieSessionIdStore();

		// add additional test code here
	}

	/**
	 * Run the void ensureRequestParamSessionIdStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testEnsureRequestParamSessionIdStore_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(null);
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		fixture.ensureRequestParamSessionIdStore();

		// add additional test code here
	}

	/**
	 * Run the void ensureRequestParamSessionIdStore() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testEnsureRequestParamSessionIdStore_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		fixture.ensureRequestParamSessionIdStore();

		// add additional test code here
	}

	/**
	 * Run the Session getSession(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testGetSession_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Session result = fixture.getSession(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CookieAttribute<Serializable> getSessionIdCookieAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testGetSessionIdCookieAttribute_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		CookieAttribute<Serializable> result = fixture.getSessionIdCookieAttribute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the RequestParamAttribute<Serializable> getSessionIdRequestParamAttribute() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testGetSessionIdRequestParamAttribute_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		RequestParamAttribute<Serializable> result = fixture.getSessionIdRequestParamAttribute();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session handleInvalidSession(ServletRequest,ServletResponse,InvalidSessionException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testHandleInvalidSession_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		InvalidSessionException ise = new InvalidSessionException();

		Session result = fixture.handleInvalidSession(request, response, ise);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session handleInvalidSession(ServletRequest,ServletResponse,InvalidSessionException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testHandleInvalidSession_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		InvalidSessionException ise = new InvalidSessionException();

		Session result = fixture.handleInvalidSession(request, response, ise);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isValidateRequestOrigin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testIsValidateRequestOrigin_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);

		boolean result = fixture.isValidateRequestOrigin();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isValidateRequestOrigin() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testIsValidateRequestOrigin_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(false);

		boolean result = fixture.isValidateRequestOrigin();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void onStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testOnStop_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onStop(session);

		// add additional test code here
	}

	/**
	 * Run the void onStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testOnStop_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onStop(session);

		// add additional test code here
	}

	/**
	 * Run the void onStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testOnStop_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onStop(session);

		// add additional test code here
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testRetrieveSession_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = new IOException();

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testRetrieveSession_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = null;

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.AuthorizationException.class)
	public void testRetrieveSession_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = null;

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRetrieveSession_4()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = new IOException();

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRetrieveSession_5()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = null;

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRetrieveSession_6()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = null;

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRetrieveSession_7()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable sessionId = null;

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable retrieveSessionId(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testRetrieveSessionId_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Serializable result = fixture.retrieveSessionId(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable retrieveSessionId(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testRetrieveSessionId_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Serializable result = fixture.retrieveSessionId(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable retrieveSessionId(ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testRetrieveSessionId_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		Serializable result = fixture.retrieveSessionId(request, response);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setSessionIdCookieAttribute(CookieAttribute<Serializable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdCookieAttribute_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		CookieAttribute<Serializable> sessionIdCookieAttribute = new CookieAttribute();

		fixture.setSessionIdCookieAttribute(sessionIdCookieAttribute);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieMaxAge(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdCookieMaxAge_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		int maxAge = 1;

		fixture.setSessionIdCookieMaxAge(maxAge);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdCookieName_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		String name = "";

		fixture.setSessionIdCookieName(name);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookiePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdCookiePath_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		String path = "";

		fixture.setSessionIdCookiePath(path);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdCookieSecure(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdCookieSecure_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		boolean secure = true;

		fixture.setSessionIdCookieSecure(secure);

		// add additional test code here
	}

	/**
	 * Run the void setSessionIdRequestParamAttribute(RequestParamAttribute<Serializable>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetSessionIdRequestParamAttribute_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		RequestParamAttribute<Serializable> sessionIdRequestParamAttribute = new RequestParamAttribute();

		fixture.setSessionIdRequestParamAttribute(sessionIdRequestParamAttribute);

		// add additional test code here
	}

	/**
	 * Run the void setValidateRequestOrigin(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testSetValidateRequestOrigin_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		boolean validateRequestOrigin = true;

		fixture.setValidateRequestOrigin(validateRequestOrigin);

		// add additional test code here
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		InetAddress hostAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(hostAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testStart_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		InetAddress hostAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(hostAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testStart_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		InetAddress hostAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(hostAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(ServletRequest,ServletResponse,InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testStart_4()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		InetAddress inetAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(request, response, inetAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(ServletRequest,ServletResponse,InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testStart_5()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		InetAddress inetAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(request, response, inetAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(ServletRequest,ServletResponse,InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testStart_6()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));
		InetAddress inetAddress = InetAddress.getLocalHost();

		Serializable result = fixture.start(request, response, inetAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void storeSessionId(Serializable,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testStoreSessionId_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable currentId = new IOException();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeSessionId(currentId, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeSessionId(Serializable,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testStoreSessionId_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable currentId = new IOException();
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeSessionId(currentId, request, response);

		// add additional test code here
	}

	/**
	 * Run the void storeSessionId(Serializable,ServletRequest,ServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testStoreSessionId_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		Serializable currentId = null;
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletResponse response = new JSecurityHttpServletResponse(new HttpServletResponseWrapper((HttpServletResponse) null), (ServletContext) null, new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true));

		fixture.storeSessionId(currentId, request, response);

		// add additional test code here
	}

	/**
	 * Run the void validateSessionOrigin(ServletRequest,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testValidateSessionOrigin_1()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validateSessionOrigin(request, session);

		// add additional test code here
	}

	/**
	 * Run the void validateSessionOrigin(ServletRequest,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test
	public void testValidateSessionOrigin_2()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validateSessionOrigin(request, session);

		// add additional test code here
	}

	/**
	 * Run the void validateSessionOrigin(ServletRequest,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testValidateSessionOrigin_3()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validateSessionOrigin(request, session);

		// add additional test code here
	}

	/**
	 * Run the void validateSessionOrigin(ServletRequest,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testValidateSessionOrigin_4()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validateSessionOrigin(request, session);

		// add additional test code here
	}

	/**
	 * Run the void validateSessionOrigin(ServletRequest,Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testValidateSessionOrigin_5()
		throws Exception {
		DefaultWebSessionManager fixture = new DefaultWebSessionManager();
		fixture.setSessionIdRequestParamAttribute(new RequestParamAttribute());
		fixture.setSessionIdCookieAttribute(new CookieAttribute());
		fixture.setValidateRequestOrigin(true);
		ServletRequest request = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validateSessionOrigin(request, session);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:34 PM
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
	 * @generatedBy CodePro at 4/19/14 3:34 PM
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
	 * @generatedBy CodePro at 4/19/14 3:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultWebSessionManagerTest.class);
	}
}