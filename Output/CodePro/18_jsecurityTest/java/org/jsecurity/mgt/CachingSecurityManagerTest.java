package org.jsecurity.mgt;

import org.jsecurity.cache.CacheException;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CachingSecurityManagerTest</code> contains tests for the class <code>{@link CachingSecurityManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CachingSecurityManagerTest {
	/**
	 * Run the void afterCacheManagerSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testAfterCacheManagerSet_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		fixture.afterCacheManagerSet();

		// add additional test code here
	}

	/**
	 * Run the void beforeCacheManagerDestroyed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBeforeCacheManagerDestroyed_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		fixture.beforeCacheManagerDestroyed();

		// add additional test code here
	}

	/**
	 * Run the CacheManager createCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testCreateCacheManager_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		CacheManager result = fixture.createCacheManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CacheManager createCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testCreateCacheManager_2()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		CacheManager result = fixture.createCacheManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroyCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDestroyCacheManager_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		fixture.destroyCacheManager();

		// add additional test code here
	}

	/**
	 * Run the void ensureCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureCacheManager_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = null;

		fixture.ensureCacheManager();

		// add additional test code here
	}

	/**
	 * Run the void ensureCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureCacheManager_2()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = null;

		fixture.ensureCacheManager();

		// add additional test code here
	}

	/**
	 * Run the void ensureCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEnsureCacheManager_3()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		fixture.ensureCacheManager();

		// add additional test code here
	}

	/**
	 * Run the CacheManager getCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCacheManager_1()
		throws Exception {
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();

		CacheManager result = fixture.getCacheManager();

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
		DefaultSecurityManager fixture = new DefaultSecurityManager();
		fixture.cacheManager = new HashtableCacheManager();
		CacheManager cacheManager = new HashtableCacheManager();

		fixture.setCacheManager(cacheManager);

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
		new org.junit.runner.JUnitCore().run(CachingSecurityManagerTest.class);
	}
}