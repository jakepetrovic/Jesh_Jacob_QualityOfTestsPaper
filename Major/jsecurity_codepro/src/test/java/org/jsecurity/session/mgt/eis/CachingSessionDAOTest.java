package org.jsecurity.session.mgt.eis;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.CacheException;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCache;
import org.jsecurity.cache.HashtableCacheManager;
import org.jsecurity.session.ProxiedSession;
import org.jsecurity.session.Session;
import org.jsecurity.session.UnknownSessionException;
import org.jsecurity.session.mgt.DelegatingSession;
import org.jsecurity.session.mgt.SimpleSession;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CachingSessionDAOTest</code> contains tests for the class <code>{@link CachingSessionDAO}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:29 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CachingSessionDAOTest {
	/**
	 * Run the void cache(Session,Serializable,Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCache_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());
		Serializable sessionId = new IOException();
		Cache cache = new HashtableCache("");

		fixture.cache(session, sessionId, cache);

		// add additional test code here
	}

	/**
	 * Run the void cache(Session,Serializable,Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testCache_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());
		Serializable sessionId = new IOException();
		Cache cache = new HashtableCache("");

		fixture.cache(session, sessionId, cache);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = null;
		Serializable sessionId = new IOException();

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());
		Serializable sessionId = null;

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_3()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());
		Serializable sessionId = new IOException();

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_4()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());
		Serializable sessionId = new IOException();

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_5()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new SimpleSession();
		Serializable sessionId = new IOException();

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the void cacheValidSession(Session,Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCacheValidSession_6()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new SimpleSession();
		Serializable sessionId = new IOException();

		fixture.cacheValidSession(session, sessionId);

		// add additional test code here
	}

	/**
	 * Run the Serializable create(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		Serializable result = fixture.create(session);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache createActiveSessionsCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testCreateActiveSessionsCache_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Cache result = fixture.createActiveSessionsCache();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache createActiveSessionsCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testCreateActiveSessionsCache_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Cache result = fixture.createActiveSessionsCache();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void delete(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testDelete_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.delete(session);

		// add additional test code here
	}

	/**
	 * Run the void ensureUncached(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testEnsureUncached_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		fixture.ensureUncached(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void ensureUncached(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testEnsureUncached_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		fixture.ensureUncached(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void ensureUncached(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testEnsureUncached_3()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		fixture.ensureUncached(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void ensureUncached(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testEnsureUncached_4()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		fixture.ensureUncached(sessionId);

		// add additional test code here
	}

	/**
	 * Run the Collection<Session> getActiveSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessions_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Collection<Session> result = fixture.getActiveSessions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Collection<Session> getActiveSessions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessions_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Collection<Session> result = fixture.getActiveSessions();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getActiveSessionsCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessionsCache_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Cache result = fixture.getActiveSessionsCache();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getActiveSessionsCacheLazy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessionsCacheLazy_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Cache result = fixture.getActiveSessionsCacheLazy();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getActiveSessionsCacheLazy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessionsCacheLazy_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		Cache result = fixture.getActiveSessionsCacheLazy();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getActiveSessionsCacheName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetActiveSessionsCacheName_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		String result = fixture.getActiveSessionsCacheName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CacheManager getCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetCacheManager_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();

		CacheManager result = fixture.getCacheManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getCachedSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetCachedSession_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		Session result = fixture.getCachedSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getCachedSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetCachedSession_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		Session result = fixture.getCachedSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getCachedSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetCachedSession_3()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = null;

		Session result = fixture.getCachedSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getCachedSession(Serializable,Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testGetCachedSession_4()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();
		Cache cache = new HashtableCache("");

		Session result = fixture.getCachedSession(sessionId, cache);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session getCachedSession(Serializable,Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCachedSession_5()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();
		Cache cache = new HashtableCache("");

		Session result = fixture.getCachedSession(sessionId, cache);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session readSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testReadSession_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		Session result = fixture.readSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session readSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.session.UnknownSessionException.class)
	public void testReadSession_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		Session result = fixture.readSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Session readSession(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.session.UnknownSessionException.class)
	public void testReadSession_3()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		Session result = fixture.readSession(sessionId);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setActiveSessionsCache(Cache) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testSetActiveSessionsCache_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Cache cache = new HashtableCache("");

		fixture.setActiveSessionsCache(cache);

		// add additional test code here
	}

	/**
	 * Run the void setActiveSessionsCacheName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testSetActiveSessionsCacheName_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		String activeSessionsCacheName = "";

		fixture.setActiveSessionsCacheName(activeSessionsCacheName);

		// add additional test code here
	}

	/**
	 * Run the void setCacheManager(CacheManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testSetCacheManager_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		CacheManager cacheManager = new HashtableCacheManager();

		fixture.setCacheManager(cacheManager);

		// add additional test code here
	}

	/**
	 * Run the void uncache(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testUncache_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = null;

		fixture.uncache(session);

		// add additional test code here
	}

	/**
	 * Run the void uncache(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testUncache_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.uncache(session);

		// add additional test code here
	}

	/**
	 * Run the void uncache(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testUncache_3()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.uncache(session);

		// add additional test code here
	}

	/**
	 * Run the void uncache(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testUncache_4()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.uncache(session);

		// add additional test code here
	}

	/**
	 * Run the void uncache(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testUncache_5()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.uncache(session);

		// add additional test code here
	}

	/**
	 * Run the void update(Session) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Session session = new ProxiedSession(new DelegatingSession());

		fixture.update(session);

		// add additional test code here
	}

	/**
	 * Run the void verifySessionId(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test
	public void testVerifySessionId_1()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = new IOException();

		fixture.verifySessionId(sessionId);

		// add additional test code here
	}

	/**
	 * Run the void verifySessionId(Serializable) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testVerifySessionId_2()
		throws Exception {
		CachingSessionDAO fixture = new MemorySessionDAO();
		Serializable sessionId = null;

		fixture.verifySessionId(sessionId);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:29 PM
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
	 * @generatedBy CodePro at 4/19/14 3:29 PM
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
	 * @generatedBy CodePro at 4/19/14 3:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CachingSessionDAOTest.class);
	}
}