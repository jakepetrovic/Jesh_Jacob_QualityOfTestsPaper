package org.jsecurity.session.mgt;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Vector;
import org.jsecurity.authz.HostUnauthorizedException;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractValidatingSessionManagerTest</code> contains tests for the class <code>{@link AbstractValidatingSessionManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:32 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractValidatingSessionManagerTest {
	/**
	 * Run the void afterSessionValidationEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testAfterSessionValidationEnabled_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.afterSessionValidationEnabled();

		// add additional test code here
	}

	/**
	 * Run the void beforeSessionValidationDisabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testBeforeSessionValidationDisabled_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.beforeSessionValidationDisabled();

		// add additional test code here
	}

	/**
	 * Run the Session createSession(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testCreateSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
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
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
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
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testCreateSession_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Session result = fixture.createSession(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionValidationScheduler createSessionValidationScheduler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testCreateSessionValidationScheduler_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		SessionValidationScheduler result = fixture.createSessionValidationScheduler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SessionValidationScheduler createSessionValidationScheduler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testCreateSessionValidationScheduler_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		SessionValidationScheduler result = fixture.createSessionValidationScheduler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void disableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testDisableSessionValidation_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.disableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void disableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testDisableSessionValidation_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.disableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void disableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testDisableSessionValidation_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = null;

		fixture.disableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the Session doGetSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testDoGetSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
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
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testDoGetSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Serializable sessionId = new IOException();

		Session result = fixture.doGetSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void enableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidation_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = null;

		fixture.enableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidation_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.enableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidation_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = null;

		fixture.enableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidation_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.enableSessionValidation();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidationIfNecessary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidationIfNecessary_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = null;

		fixture.enableSessionValidationIfNecessary();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidationIfNecessary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidationIfNecessary_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.enableSessionValidationIfNecessary();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidationIfNecessary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidationIfNecessary_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = false;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.enableSessionValidationIfNecessary();

		// add additional test code here
	}

	/**
	 * Run the void enableSessionValidationIfNecessary() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testEnableSessionValidationIfNecessary_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.enableSessionValidationIfNecessary();

		// add additional test code here
	}

	/**
	 * Run the long getGlobalSessionTimeout() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testGetGlobalSessionTimeout_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		long result = fixture.getGlobalSessionTimeout();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getSessionValidationInterval() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testGetSessionValidationInterval_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		long result = fixture.getSessionValidationInterval();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the SessionValidationScheduler getSessionValidationScheduler() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testGetSessionValidationScheduler_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		SessionValidationScheduler result = fixture.getSessionValidationScheduler();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getTimeout(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testGetTimeout_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Session session = new ProxiedSession(new DelegatingSession());

		long result = fixture.getTimeout(session);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getTimeout(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetTimeout_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Session session = new ProxiedSession(new DelegatingSession());

		long result = fixture.getTimeout(session);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the boolean isSessionValidationSchedulerEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testIsSessionValidationSchedulerEnabled_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		boolean result = fixture.isSessionValidationSchedulerEnabled();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isSessionValidationSchedulerEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testIsSessionValidationSchedulerEnabled_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = false;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		boolean result = fixture.isSessionValidationSchedulerEnabled();

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void setGlobalSessionTimeout(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testSetGlobalSessionTimeout_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		int globalSessionTimeout = 1;

		fixture.setGlobalSessionTimeout(globalSessionTimeout);

		// add additional test code here
	}

	/**
	 * Run the void setSessionValidationInterval(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testSetSessionValidationInterval_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		long sessionValidationInterval = 1L;

		fixture.setSessionValidationInterval(sessionValidationInterval);

		// add additional test code here
	}

	/**
	 * Run the void setSessionValidationScheduler(SessionValidationScheduler) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testSetSessionValidationScheduler_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		SessionValidationScheduler sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.setSessionValidationScheduler(sessionValidationScheduler);

		// add additional test code here
	}

	/**
	 * Run the void setSessionValidationSchedulerEnabled(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testSetSessionValidationSchedulerEnabled_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		boolean sessionValidationSchedulerEnabled = true;

		fixture.setSessionValidationSchedulerEnabled(sessionValidationSchedulerEnabled);

		// add additional test code here
	}

	/**
	 * Run the void validate(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidate_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Session session = new SimpleSession();

		fixture.validate(session);

		// add additional test code here
	}

	/**
	 * Run the void validate(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testValidate_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.validate(session);

		// add additional test code here
	}

	/**
	 * Run the void validateSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Serializable sessionId = new IOException();

		fixture.validateSession(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void validateSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testValidateSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();
		Serializable sessionId = new IOException();

		fixture.validateSession(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_5()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_6()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_7()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_8()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_9()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_10()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_11()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_12()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_13()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_14()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_15()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Run the void validateSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	@Test
	public void testValidateSessions_16()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		fixture.globalSessionTimeout = 1L;
		fixture.sessionValidationSchedulerEnabled = true;
		fixture.sessionValidationInterval = 1L;
		fixture.sessionValidationScheduler = new ExecutorServiceSessionValidationScheduler();

		fixture.validateSessions();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:32 PM
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
	 * @generatedBy CodePro at 4/19/14 3:32 PM
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
	 * @generatedBy CodePro at 4/19/14 3:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractValidatingSessionManagerTest.class);
	}
}