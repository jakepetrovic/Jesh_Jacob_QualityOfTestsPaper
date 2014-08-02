package org.jsecurity.web.servlet;

import java.util.Enumeration;
import java.util.Set;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSessionContext;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.mgt.DelegatingSession;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JSecurityHttpSessionTest</code> contains tests for the class <code>{@link JSecurityHttpSession}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class JSecurityHttpSessionTest {
	/**
	 * Run the JSecurityHttpSession(Session,HttpServletRequest,ServletContext) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testJSecurityHttpSession_1()
		throws Exception {
		Session session = new ProxiedSession(new DelegatingSession());
		HttpServletRequest currentRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletContext servletContext = null;

		JSecurityHttpSession result = new JSecurityHttpSession(session, currentRequest, servletContext);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/servlet/JSecurityHttpSession : Unsupported major.minor version 51.0
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
	 * Run the JSecurityHttpSession(Session,HttpServletRequest,ServletContext) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testJSecurityHttpSession_2()
		throws Exception {
		Session session = new ProxiedSession(new DelegatingSession());
		HttpServletRequest currentRequest = new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true);
		ServletContext servletContext = null;

		JSecurityHttpSession result = new JSecurityHttpSession(session, currentRequest, servletContext);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/web/servlet/JSecurityHttpSession : Unsupported major.minor version 51.0
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
	 * Run the void afterBound(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterBound_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = null;

		fixture.afterBound(s, o);

		// add additional test code here
	}

	/**
	 * Run the void afterBound(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterBound_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = new Object();

		fixture.afterBound(s, o);

		// add additional test code here
	}

	/**
	 * Run the void afterUnbound(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterUnbound_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = null;

		fixture.afterUnbound(s, o);

		// add additional test code here
	}

	/**
	 * Run the void afterUnbound(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testAfterUnbound_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = new Object();

		fixture.afterUnbound(s, o);

		// add additional test code here
	}

	/**
	 * Run the Object getAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		Object result = fixture.getAttribute(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetAttribute_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		Object result = fixture.getAttribute(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Enumeration getAttributeNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetAttributeNames_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Enumeration result = fixture.getAttributeNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getCreationTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetCreationTime_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		long result = fixture.getCreationTime();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getKeyNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetKeyNames_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Set<String> result = fixture.getKeyNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getKeyNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetKeyNames_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Set<String> result = fixture.getKeyNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getKeyNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetKeyNames_3()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Set<String> result = fixture.getKeyNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getKeyNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetKeyNames_4()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Set<String> result = fixture.getKeyNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<String> getKeyNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetKeyNames_5()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Set<String> result = fixture.getKeyNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getLastAccessedTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetLastAccessedTime_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		long result = fixture.getLastAccessedTime();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the int getMaxInactiveInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetMaxInactiveInterval_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		int result = fixture.getMaxInactiveInterval();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getMaxInactiveInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetMaxInactiveInterval_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		int result = fixture.getMaxInactiveInterval();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the ServletContext getServletContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetServletContext_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		ServletContext result = fixture.getServletContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSession_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		Session result = fixture.getSession();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the HttpSessionContext getSessionContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetSessionContext_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		HttpSessionContext result = fixture.getSessionContext();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetValue_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		Object result = fixture.getValue(s);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getValueNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetValueNames_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String[] result = fixture.getValueNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String[] getValueNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testGetValueNames_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		String[] result = fixture.getValueNames();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void invalidate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testInvalidate_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		fixture.invalidate();

		// add additional test code here
	}

	/**
	 * Run the void invalidate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testInvalidate_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		fixture.invalidate();

		// add additional test code here
	}

	/**
	 * Run the boolean isNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsNew_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isNew();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsNew_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isNew();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testIsNew_3()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);

		boolean result = fixture.isNew();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void putValue(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testPutValue_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = new Object();

		fixture.putValue(s, o);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		fixture.removeAttribute(s);

		// add additional test code here
	}

	/**
	 * Run the void removeAttribute(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testRemoveAttribute_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		fixture.removeAttribute(s);

		// add additional test code here
	}

	/**
	 * Run the void removeValue(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testRemoveValue_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";

		fixture.removeValue(s);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = new Object();

		fixture.setAttribute(s, o);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(String,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testSetAttribute_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		String s = "";
		Object o = new Object();

		fixture.setAttribute(s, o);

		// add additional test code here
	}

	/**
	 * Run the void setMaxInactiveInterval(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetMaxInactiveInterval_1()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		int i = 1;

		fixture.setMaxInactiveInterval(i);

		// add additional test code here
	}

	/**
	 * Run the void setMaxInactiveInterval(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testSetMaxInactiveInterval_2()
		throws Exception {
		JSecurityHttpSession fixture = new JSecurityHttpSession(new ProxiedSession(new DelegatingSession()), new JSecurityHttpServletRequest(new HttpServletRequestWrapper((HttpServletRequest) null), (ServletContext) null, true), (ServletContext) null);
		int i = 1;

		fixture.setMaxInactiveInterval(i);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JSecurityHttpSessionTest.class);
	}
}