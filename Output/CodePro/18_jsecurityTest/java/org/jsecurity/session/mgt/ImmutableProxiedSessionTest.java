package org.jsecurity.session.mgt;

import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImmutableProxiedSessionTest</code> contains tests for the class <code>{@link ImmutableProxiedSession}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:07 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ImmutableProxiedSessionTest {
	/**
	 * Run the ImmutableProxiedSession(Session) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testImmutableProxiedSession_1()
		throws Exception {
		Session target = new ProxiedSession(new DelegatingSession());

		ImmutableProxiedSession result = new ImmutableProxiedSession(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/session/mgt/ImmutableProxiedSession : Unsupported major.minor version 51.0
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
	 * Run the Object removeAttribute(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRemoveAttribute_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = java.lang.InternalError.class)
	public void testRemoveAttribute_2()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
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
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_2()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(key, value);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testSetTimeout_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetTimeout_2()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void stop() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testStop_2()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));

		fixture.stop();

		// add additional test code here
	}

	/**
	 * Run the void throwImmutableException() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testThrowImmutableException_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));

		fixture.throwImmutableException();

		// add additional test code here
	}

	/**
	 * Run the void touch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test
	public void testTouch_1()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));

		fixture.touch();

		// add additional test code here
	}

	/**
	 * Run the void touch() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:07 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testTouch_2()
		throws Exception {
		ImmutableProxiedSession fixture = new ImmutableProxiedSession(new ProxiedSession(new DelegatingSession()));

		fixture.touch();

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
		new org.junit.runner.JUnitCore().run(ImmutableProxiedSessionTest.class);
	}
}