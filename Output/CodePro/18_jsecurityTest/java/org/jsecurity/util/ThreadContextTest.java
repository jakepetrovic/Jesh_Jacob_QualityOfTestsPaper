package org.jsecurity.util;

import java.net.InetAddress;
import java.util.Map;
import org.jsecurity.mgt.DefaultSecurityManager;
import org.jsecurity.mgt.SecurityManager;
import org.jsecurity.subject.DelegatingSubject;
import org.jsecurity.subject.Subject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ThreadContextTest</code> contains tests for the class <code>{@link ThreadContext}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:12 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class ThreadContextTest {
	/**
	 * Run the void bind(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		InetAddress inetAddress = InetAddress.getLocalHost();

		ThreadContext.bind(inetAddress);

		// add additional test code here
	}

	/**
	 * Run the void bind(InetAddress) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_2()
		throws Exception {
		InetAddress inetAddress = null;

		ThreadContext.bind(inetAddress);

		// add additional test code here
	}

	/**
	 * Run the void bind(SecurityManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_3()
		throws Exception {
		SecurityManager securityManager = new DefaultSecurityManager();

		ThreadContext.bind(securityManager);

		// add additional test code here
	}

	/**
	 * Run the void bind(SecurityManager) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_4()
		throws Exception {
		SecurityManager securityManager = null;

		ThreadContext.bind(securityManager);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_5()
		throws Exception {
		Subject subject = new DelegatingSubject(new DefaultSecurityManager());

		ThreadContext.bind(subject);

		// add additional test code here
	}

	/**
	 * Run the void bind(Subject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testBind_6()
		throws Exception {
		Subject subject = null;

		ThreadContext.bind(subject);

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
	public void testClear_1()
		throws Exception {

		ThreadContext.clear();

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

		ThreadContext.clear();

		// add additional test code here
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testContainsKey_1()
		throws Exception {
		Object key = new Object();

		boolean result = ThreadContext.containsKey(key);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testContainsKey_2()
		throws Exception {
		Object key = new Object();

		boolean result = ThreadContext.containsKey(key);

		// add additional test code here
		assertTrue(result);
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
		Object key = new Object();

		Object result = ThreadContext.get(key);

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
		Object key = new Object();

		Object result = ThreadContext.get(key);

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
		Object key = new Object();

		Object result = ThreadContext.get(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress getInetAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetInetAddress_1()
		throws Exception {

		InetAddress result = ThreadContext.getInetAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Map<Object, Object> getResources() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetResources_1()
		throws Exception {

		Map<Object, Object> result = ThreadContext.getResources();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager getSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSecurityManager_1()
		throws Exception {

		SecurityManager result = ThreadContext.getSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject getSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testGetSubject_1()
		throws Exception {

		Subject result = ThreadContext.getSubject();

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
		Object key = new Object();
		Object value = null;

		ThreadContext.put(key, value);

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
		Object key = new Object();
		Object value = new Object();

		ThreadContext.put(key, value);

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
	public void testPut_3()
		throws Exception {
		Object key = new Object();
		Object value = new Object();

		ThreadContext.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the void put(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testPut_4()
		throws Exception {
		Object key = null;
		Object value = new Object();

		ThreadContext.put(key, value);

		// add additional test code here
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Object key = new Object();

		Object result = ThreadContext.remove(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Object key = new Object();

		Object result = ThreadContext.remove(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Object key = new Object();

		Object result = ThreadContext.remove(key);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InetAddress unbindInetAddress() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindInetAddress_1()
		throws Exception {

		InetAddress result = ThreadContext.unbindInetAddress();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SecurityManager unbindSecurityManager() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindSecurityManager_1()
		throws Exception {

		SecurityManager result = ThreadContext.unbindSecurityManager();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Subject unbindSubject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:12 PM
	 */
	@Test
	public void testUnbindSubject_1()
		throws Exception {

		Subject result = ThreadContext.unbindSubject();

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
		new org.junit.runner.JUnitCore().run(ThreadContextTest.class);
	}
}