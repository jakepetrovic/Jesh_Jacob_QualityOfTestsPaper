package org.jsecurity.cache.ehcache;

import java.io.InputStream;
import org.jsecurity.cache.Cache;
import org.jsecurity.cache.CacheException;
import net.sf.ehcache.CacheManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EhCacheManagerTest</code> contains tests for the class <code>{@link EhCacheManager}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class EhCacheManagerTest {
	/**
	 * Run the EhCacheManager() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEhCacheManager_1()
		throws Exception {

		EhCacheManager result = new EhCacheManager();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/cache/ehcache/EhCacheManager : Unsupported major.minor version 51.0
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
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testDestroy_2()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCache_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCache_2()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCache_3()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCache_4()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCache_5()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCache_6()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCache_7()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCache_8()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = org.jsecurity.cache.CacheException.class)
	public void testGetCache_9()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testGetCache_10()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testGetCache_11()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCache_12()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCache_13()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCache_14()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Cache getCache(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCache_15()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String name = "jsecurity-activeSessionCache";

		Cache result = fixture.getCache(name);

		// add additional test code here
		assertNotNull(result);
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
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		CacheManager result = fixture.getCacheManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getCacheManagerConfigFile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCacheManagerConfigFile_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		String result = fixture.getCacheManagerConfigFile();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getCacheManagerConfigFileInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetCacheManagerConfigFileInputStream_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		InputStream result = fixture.getCacheManagerConfigFileInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputStream getCacheManagerConfigFileInputStream() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testGetCacheManagerConfigFileInputStream_2()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		InputStream result = fixture.getCacheManagerConfigFileInputStream();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_4()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_5()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_6()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_7()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_8()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager((CacheManager) null);
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testInit_9()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");

		fixture.init();

		// add additional test code here
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
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		CacheManager manager = new CacheManager();

		fixture.setCacheManager(manager);

		// add additional test code here
	}

	/**
	 * Run the void setCacheManagerConfigFile(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSetCacheManagerConfigFile_1()
		throws Exception {
		EhCacheManager fixture = new EhCacheManager();
		fixture.setCacheManager(new CacheManager());
		fixture.setCacheManagerConfigFile("");
		String classpathLocation = "";

		fixture.setCacheManagerConfigFile(classpathLocation);

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
		new org.junit.runner.JUnitCore().run(EhCacheManagerTest.class);
	}
}