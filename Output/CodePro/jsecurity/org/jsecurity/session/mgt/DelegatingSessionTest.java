package org.jsecurity.session.mgt;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Date;
import org.jsecurity.session.InvalidSessionException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DelegatingSessionTest</code> contains tests for the class <code>{@link DelegatingSession}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:23 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DelegatingSessionTest {
	/**
	 * Run the DelegatingSession() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testDelegatingSession_1()
		throws Exception {

		DelegatingSession result = new DelegatingSession();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/session/mgt/DelegatingSession : Unsupported major.minor version 51.0
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
	 * Run the DelegatingSession(SessionManager,Serializable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testDelegatingSession_2()
		throws Exception {
		SessionManager sessionManager = new DefaultSessionManager();
		Serializable id = new IOException();

		DelegatingSession result = new DelegatingSession(sessionManager, id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/session/mgt/DelegatingSession : Unsupported major.minor version 51.0
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
	 * Run the Object getAttribute(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();

		Object result = fixture.getAttribute(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAttribute(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAttribute_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();

		Object result = fixture.getAttribute(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Object> getAttributeKeys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetAttributeKeys_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		Collection<Object> result = fixture.getAttributeKeys();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getHostAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetHostAddress_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		InetAddress result = fixture.getHostAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getHostAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetHostAddress_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		InetAddress result = fixture.getHostAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		Serializable result = fixture.getId();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getLastAccessTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetLastAccessTime_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		Date result = fixture.getLastAccessTime();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionManager getSessionManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetSessionManager_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		SessionManager result = fixture.getSessionManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getStartTimestamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetStartTimestamp_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		Date result = fixture.getStartTimestamp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getStartTimestamp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetStartTimestamp_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		Date result = fixture.getStartTimestamp();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testGetTimeout_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		long result = fixture.getTimeout();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetTimeout_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		long result = fixture.getTimeout();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Object removeAttribute(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();

		Object result = fixture.removeAttribute(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object removeAttribute(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRemoveAttribute_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();

		Object result = fixture.removeAttribute(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAttribute(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetAttribute_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();
		Object value = null;

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_3()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();
		Object value = null;

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_4()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setId(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		Serializable id = new IOException();

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setSessionManager(SessionManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetSessionManager_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		SessionManager sessionManager = new DefaultSessionManager();

		fixture.setSessionManager(sessionManager);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testSetTimeout_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetTimeout_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testStop_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void touch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test
	public void testTouch_1()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		fixture.touch();

		// add additional test code here
	}

	/**
	 * Run the void touch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:23 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testTouch_2()
		throws Exception {
		DelegatingSession fixture = new DelegatingSession(new DefaultSessionManager(), new IOException());

		fixture.touch();

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
		new org.junit.runner.JUnitCore().run(DelegatingSessionTest.class);
	}
}