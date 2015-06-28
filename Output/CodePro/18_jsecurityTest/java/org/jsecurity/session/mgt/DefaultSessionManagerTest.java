package org.jsecurity.session.mgt;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.jsecurity.session.UnknownSessionException;
import org.jsecurity.session.mgt.eis.MemorySessionDAO;
import org.jsecurity.session.mgt.eis.SessionDAO;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DefaultSessionManagerTest</code> contains tests for the class <code>{@link DefaultSessionManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class DefaultSessionManagerTest {
	/**
	 * Run the DefaultSessionManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDefaultSessionManager_1()
		throws Exception {

		DefaultSessionManager result = new DefaultSessionManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/session/mgt/DefaultSessionManager : Unsupported major.minor version 51.0
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
	 * Run the void create(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.create(session);

		// add additional test code here
	}

	/**
	 * Run the void create(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.create(session);

		// add additional test code here
	}

	/**
	 * Run the Session doCreateSession(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoCreateSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Session result = fixture.doCreateSession(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session doCreateSession(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDoCreateSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Session result = fixture.doCreateSession(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Session> getActiveSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetActiveSessions_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();

		Collection<Session> result = fixture.getActiveSessions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Session> getActiveSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetActiveSessions_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();

		Collection<Session> result = fixture.getActiveSessions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionDAO getSessionDAO() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSessionDAO_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();

		SessionDAO result = fixture.getSessionDAO();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session newSessionInstance(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testNewSessionInstance_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		InetAddress inetAddress = InetAddress.getLocalHost();

		Session result = fixture.newSessionInstance(inetAddress);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onChange(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnChange_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onChange(session);

		// add additional test code here
	}

	/**
	 * Run the void onChange(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.UnknownSessionException.class)
	public void testOnChange_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onChange(session);

		// add additional test code here
	}

	/**
	 * Run the void onExpiration(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnExpiration_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new SimpleSession();

		fixture.onExpiration(session);

		// add additional test code here
	}

	/**
	 * Run the void onExpiration(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnExpiration_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onExpiration(session);

		// add additional test code here
	}

	/**
	 * Run the void onStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnStop_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		SimpleSession session = new SimpleSession();
		session.setStopTimestamp(new Date());

		fixture.onStop(session);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/session/mgt/SimpleSession : Unsupported major.minor version 51.0
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
	 * Run the void onStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testOnStop_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onStop(session);

		// add additional test code here
	}

	/**
	 * Run the Session retrieveSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRetrieveSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRetrieveSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.session.UnknownSessionException.class)
	public void testRetrieveSession_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Session result = fixture.retrieveSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheManager(CacheManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetCacheManager_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		CacheManager cacheManager = new HashtableCacheManager();

		fixture.setCacheManager(cacheManager);

		// add additional test code here
	}

	/**
	 * Run the void setSessionDAO(SessionDAO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetSessionDAO_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.setSessionDAO(new MemorySessionDAO());
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		fixture.listeners = new Vector();
		SessionDAO sessionDAO = new MemorySessionDAO();

		fixture.setSessionDAO(sessionDAO);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
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
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(DefaultSessionManagerTest.class);
	}
}