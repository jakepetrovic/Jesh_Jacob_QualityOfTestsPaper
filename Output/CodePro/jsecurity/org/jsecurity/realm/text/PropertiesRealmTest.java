package org.jsecurity.realm.text;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.jsecurity.cache.CacheManager;
import org.jsecurity.cache.HashtableCacheManager;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PropertiesRealmTest</code> contains tests for the class <code>{@link PropertiesRealm}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:31 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class PropertiesRealmTest {
	/**
	 * Run the PropertiesRealm() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testPropertiesRealm_1()
		throws Exception {

		PropertiesRealm result = new PropertiesRealm();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/text/PropertiesRealm : Unsupported major.minor version 51.0
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
	 * Run the PropertiesRealm(CacheManager) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testPropertiesRealm_2()
		throws Exception {
		CacheManager cacheManager = null;

		PropertiesRealm result = new PropertiesRealm(cacheManager);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/text/PropertiesRealm : Unsupported major.minor version 51.0
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
	 * Run the PropertiesRealm(CacheManager) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testPropertiesRealm_3()
		throws Exception {
		CacheManager cacheManager = new HashtableCacheManager();

		PropertiesRealm result = new PropertiesRealm(cacheManager);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.UnsupportedClassVersionError: org/jsecurity/realm/text/PropertiesRealm : Unsupported major.minor version 51.0
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
	 * Run the void afterRoleCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAfterRoleCacheSet_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("file:");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.afterRoleCacheSet();

		// add additional test code here
	}

	/**
	 * Run the void afterRoleCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAfterRoleCacheSet_2()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.afterRoleCacheSet();

		// add additional test code here
	}

	/**
	 * Run the void afterRoleCacheSet() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testAfterRoleCacheSet_3()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("file:");
		fixture.scheduler = null;
		fixture.fileLastModified = 1L;

		fixture.afterRoleCacheSet();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testDestroy_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the void destroy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testDestroy_2()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = null;
		fixture.fileLastModified = 1L;

		fixture.destroy();

		// add additional test code here
	}

	/**
	 * Run the String getName(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "";
		String prefix = "";

		String result = fixture.getName(key, prefix);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getRolename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetRolename_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "";

		String result = fixture.getRolename(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testGetUsername_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "";

		String result = fixture.getUsername(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isRolename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsRolename_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "role.";

		boolean result = fixture.isRolename(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRolename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsRolename_2()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = null;

		boolean result = fixture.isRolename(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isRolename(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsRolename_3()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "";

		boolean result = fixture.isRolename(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsUsername_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "user.";

		boolean result = fixture.isUsername(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsUsername_2()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = null;

		boolean result = fixture.isUsername(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean isUsername(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testIsUsername_3()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String key = "";

		boolean result = fixture.isUsername(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void setReloadIntervalSeconds(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testSetReloadIntervalSeconds_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		int reloadIntervalSeconds = 1;

		fixture.setReloadIntervalSeconds(reloadIntervalSeconds);

		// add additional test code here
	}

	/**
	 * Run the void setResourcePath(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testSetResourcePath_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		String resourcePath = "";

		fixture.setResourcePath(resourcePath);

		// add additional test code here
	}

	/**
	 * Run the void setUseXmlFormat(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testSetUseXmlFormat_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;
		boolean useXmlFormat = true;

		fixture.setUseXmlFormat(useXmlFormat);

		// add additional test code here
	}

	/**
	 * Run the void startReloadThread() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testStartReloadThread_1()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(1);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.startReloadThread();

		// add additional test code here
	}

	/**
	 * Run the void startReloadThread() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	@Test
	public void testStartReloadThread_2()
		throws Exception {
		PropertiesRealm fixture = new PropertiesRealm();
		fixture.setReloadIntervalSeconds(0);
		fixture.setUseXmlFormat(true);
		fixture.setResourcePath("");
		fixture.scheduler = new ForkJoinPool();
		fixture.fileLastModified = 1L;

		fixture.startReloadThread();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:31 PM
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
	 * @generatedBy CodePro at 4/19/14 3:31 PM
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
	 * @generatedBy CodePro at 4/19/14 3:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PropertiesRealmTest.class);
	}
}