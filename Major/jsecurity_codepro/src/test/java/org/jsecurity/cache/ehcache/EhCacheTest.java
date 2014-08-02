package org.jsecurity.cache.ehcache;

import java.util.Set;
import org.junit.*;
import net.sf.ehcache.Cache;
import static org.junit.Assert.*;

/**
 * The class <code>EhCacheTest</code> contains tests for the class <code>{@link EhCache}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class EhCacheTest {
	/**
	 * Run the EhCache(Cache) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEhCache_1()
		throws Exception {
		Cache cache = null;

		EhCache result = new EhCache(cache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/cache/ehcache/EhCache : Unsupported major.minor version 51.0
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
	 * Run the EhCache(Cache) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testEhCache_2()
		throws Exception {
		Cache cache = new Cache("", 1, true, true, 1L, 1L);

		EhCache result = new EhCache(cache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/cache/ehcache/EhCache : Unsupported major.minor version 51.0
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
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testClear_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the void clear() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testClear_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		fixture.clear();

		// add additional test code here
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = null;

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGet_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGet_3()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGet_4()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();

		Object result = fixture.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the long getDiskStoreSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetDiskStoreSize_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		long result = fixture.getDiskStoreSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMemoryStoreSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetMemoryStoreSize_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		long result = fixture.getMemoryStoreSize();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMemoryUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetMemoryUsage_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		long result = fixture.getMemoryUsage();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMemoryUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetMemoryUsage_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		long result = fixture.getMemoryUsage();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the long getMemoryUsage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetMemoryUsage_3()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		long result = fixture.getMemoryUsage();

		// add additional test code here
		assertEquals(0L, result);
	}

	/**
	 * Run the Set keys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testKeys_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.keys();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set keys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testKeys_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.keys();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set keys() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testKeys_3()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.keys();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void put(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPut_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();
		Object value = new Object();

		fixture.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the void put(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testPut_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();
		Object value = new Object();

		fixture.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the void remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();

		fixture.remove(key);

		// add additional test code here
	}

	/**
	 * Run the void remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));
		Object key = new Object();

		fixture.remove(key);

		// add additional test code here
	}

	/**
	 * Run the int size() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testSize_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		int result = fixture.size();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testValues_1()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.values();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testValues_2()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.values();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testValues_3()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.values();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set values() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testValues_4()
		throws Exception {
		EhCache fixture = new EhCache(new Cache("", 1, true, true, 1L, 1L));

		Set result = fixture.values();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(EhCacheTest.class);
	}
}