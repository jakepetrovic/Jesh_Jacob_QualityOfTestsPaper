package org.jsecurity.session.mgt;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;
import org.jsecurity.authz.HostUnauthorizedException;
import org.jsecurity.session.InvalidSessionException;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.SessionListener;
import org.jsecurity.session.UnknownSessionException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractSessionManagerTest</code> contains tests for the class <code>{@link AbstractSessionManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:46 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AbstractSessionManagerTest {
	/**
	 * Run the void add(SessionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		SessionListener listener = null;

		fixture.add(listener);

		// add additional test code here
	}

	/**
	 * Run the Session beforeInvalidNotification(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testBeforeInvalidNotification_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		Session result = fixture.beforeInvalidNotification(session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAttribute_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.getAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAttribute_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.getAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAttribute_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.getAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Object> getAttributeKeys(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetAttributeKeys_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Collection<Object> result = fixture.getAttributeKeys(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Object> getAttributeKeys(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAttributeKeys_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Collection<Object> result = fixture.getAttributeKeys(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Object> getAttributeKeys(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetAttributeKeys_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Collection<Object> result = fixture.getAttributeKeys(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getHostAddress(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetHostAddress_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		InetAddress result = fixture.getHostAddress(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getHostAddress(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetHostAddress_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		InetAddress result = fixture.getHostAddress(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getLastAccessTime(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetLastAccessTime_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Date result = fixture.getLastAccessTime(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getLastAccessTime(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetLastAccessTime_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Date result = fixture.getLastAccessTime(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetSession_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Session result = fixture.getSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetSession_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Session result = fixture.getSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.UnknownSessionException.class)
	public void testGetSession_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Session result = fixture.getSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getStartTimestamp(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetStartTimestamp_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Date result = fixture.getStartTimestamp(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Date getStartTimestamp(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetStartTimestamp_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		Date result = fixture.getStartTimestamp(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getTimeout(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testGetTimeout_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		long result = fixture.getTimeout(sessionId);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getTimeout(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetTimeout_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		long result = fixture.getTimeout(sessionId);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getTimeout(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testGetTimeout_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		long result = fixture.getTimeout(sessionId);

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the boolean isValid(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsValid_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		boolean result = fixture.isValid(sessionId);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isValid(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testIsValid_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		boolean result = fixture.isValid(sessionId);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void notifyExpiration(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyExpiration_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyExpiration(session);

		// add additional test code here
	}

	/**
	 * Run the void notifyExpiration(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyExpiration_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyExpiration(session);

		// add additional test code here
	}

	/**
	 * Run the void notifyStart(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyStart_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyStart(session);

		// add additional test code here
	}

	/**
	 * Run the void notifyStart(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyStart_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyStart(session);

		// add additional test code here
	}

	/**
	 * Run the void notifyStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyStop_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyStop(session);

		// add additional test code here
	}

	/**
	 * Run the void notifyStop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testNotifyStop_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.notifyStop(session);

		// add additional test code here
	}

	/**
	 * Run the void onChange(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnChange_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session s = new ProxiedSession(new DelegatingSession());

		fixture.onChange(s);

		// add additional test code here
	}

	/**
	 * Run the void onExpiration(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnExpiration_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testOnStop_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.onStop(session);

		// add additional test code here
	}

	/**
	 * Run the boolean remove(SessionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		SessionListener listener = null;

		boolean result = fixture.remove(listener);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean remove(SessionListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		SessionListener listener = null;

		boolean result = fixture.remove(listener);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the Object removeAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRemoveAttribute_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.removeAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object removeAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testRemoveAttribute_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.removeAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object removeAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRemoveAttribute_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.removeAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object removeAttribute(Serializable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testRemoveAttribute_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();

		Object result = fixture.removeAttribute(sessionId, key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setAttribute(Serializable,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetAttribute_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(sessionId, key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Serializable,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetAttribute_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();
		Object value = null;

		fixture.setAttribute(sessionId, key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Serializable,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();
		Object value = null;

		fixture.setAttribute(sessionId, key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Serializable,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(sessionId, key, value);

		// add additional test code here
	}

	/**
	 * Run the void setAttribute(Serializable,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetAttribute_5()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		Object key = new Object();
		Object value = new Object();

		fixture.setAttribute(sessionId, key, value);

		// add additional test code here
	}

	/**
	 * Run the void setSessionListeners(Collection<SessionListener>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetSessionListeners_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Collection<SessionListener> listeners = new Vector();

		fixture.setSessionListeners(listeners);

		// add additional test code here
	}

	/**
	 * Run the void setSessionListeners(Collection<SessionListener>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetSessionListeners_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Collection<SessionListener> listeners = null;

		fixture.setSessionListeners(listeners);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(Serializable,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testSetTimeout_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(sessionId, maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(Serializable,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetTimeout_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(sessionId, maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the void setTimeout(Serializable,long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testSetTimeout_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();
		long maxIdleTimeInMillis = 1L;

		fixture.setTimeout(sessionId, maxIdleTimeInMillis);

		// add additional test code here
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Serializable result = fixture.start(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testStart_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Serializable result = fixture.start(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Serializable start(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.authz.HostUnauthorizedException.class)
	public void testStart_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		InetAddress originatingHost = InetAddress.getLocalHost();

		Serializable result = fixture.start(originatingHost);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void stop(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		fixture.stop(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void stop(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testStop_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		fixture.stop(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void stop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStop_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.stop(session);

		// add additional test code here
	}

	/**
	 * Run the void stop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testStop_4()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.stop(session);

		// add additional test code here
	}

	/**
	 * Run the void stop(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testStop_5()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.stop(session);

		// add additional test code here
	}

	/**
	 * Run the void touch(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test
	public void testTouch_1()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		fixture.touch(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void touch(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testTouch_2()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		fixture.touch(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void touch(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	@Test(expected = org.jsecurity.session.InvalidSessionException.class)
	public void testTouch_3()
		throws Exception {
		DefaultSessionManager fixture = new DefaultSessionManager();
		fixture.listeners = new Vector();
		Serializable sessionId = new IOException();

		fixture.touch(sessionId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
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
	 * @generatedBy CodePro at 4/19/14 3:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractSessionManagerTest.class);
	}
}