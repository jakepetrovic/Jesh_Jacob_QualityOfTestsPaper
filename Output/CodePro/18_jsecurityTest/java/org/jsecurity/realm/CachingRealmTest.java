package org.jsecurity.realm;

import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CachingRealmTest</code> contains tests for the class <code>{@link CachingRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:47 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CachingRealmTest {
	/**
	 * Run the void afterCacheManagerSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testAfterCacheManagerSet_1()
		throws Exception {
		CachingRealm fixture = new SimpleAccountRealm();

		fixture.afterCacheManagerSet();

		// add additional test code here
	}

	/**
	 * Run the CacheManager getCacheManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testGetCacheManager_1()
		throws Exception {
		CachingRealm fixture = new SimpleAccountRealm();

		CacheManager result = fixture.getCacheManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		CachingRealm fixture = new SimpleAccountRealm();

		String result = fixture.getName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCacheManager(CacheManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testSetCacheManager_1()
		throws Exception {
		CachingRealm fixture = new SimpleAccountRealm();
		CacheManager authzInfoCacheManager = new HashtableCacheManager();

		fixture.setCacheManager(authzInfoCacheManager);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		CachingRealm fixture = new SimpleAccountRealm();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
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
	 * @generatedBy CodePro at 4/19/14 3:47 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CachingRealmTest.class);
	}
}