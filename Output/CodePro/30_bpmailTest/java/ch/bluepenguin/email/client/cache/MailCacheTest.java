package ch.bluepenguin.email.client.cache;

import java.util.ArrayList;
import net.sf.ehcache.Cache;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import junit.framework.*;

/**
 * The class <code>MailCacheTest</code> contains tests for the class <code>{@link MailCache}</code>.
 *
 * @generatedBy CodePro at 6/7/15 3:11 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class MailCacheTest extends TestCase {
	/**
	 * An instance of the class being tested.
	 *
	 * @see MailCache
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	private MailCache fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see MailCache
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public MailCache getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new MailCache("");
		}
		return fixture;
	}

	/**
	 * Run the MailCache(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMailCache_1()
		throws Exception {
		String config = "";

		MailCache result = new MailCache(config);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the MailCache(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testMailCache_2()
		throws Exception {
		String config = "0123456789";

		MailCache result = new MailCache(config);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCache());
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_1()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = new Object();
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_2()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = null;
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_3()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = new Object();
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_4()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = null;
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_5()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = null;
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_6()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = new Object();
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_7()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = null;
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_8()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = new Object();
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_9()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = new Object();
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_10()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = null;
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_11()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = new Object();
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_12()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = null;
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_13()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = null;
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_14()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = new Object();
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_15()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = null;
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_16()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = new Object();
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_17()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = new Object();
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_18()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = null;
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_19()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = new Object();
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_20()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);
		Object element = null;
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_21()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = null;
		List childList = new ArrayList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_22()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = new Object();
		List childList = new LinkedList();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_23()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);
		Object element = null;
		List childList = new Vector();

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:51)
	}

	/**
	 * Run the void addElement(Integer,Object,List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testAddElement_fixture_24()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);
		Object element = new Object();
		List childList = null;

		fixture2.addElement(id, element, childList);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Object cannot be cast to java.io.Serializable
		//       at ch.bluepenguin.email.client.cache.MailCache.addElement(MailCache.java:50)
	}

	/**
	 * Run the void clearCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testClearCache_fixture_1()
		throws Exception {
		MailCache fixture2 = getFixture();

		fixture2.clearCache();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.clearCache(MailCache.java:56)
	}

	/**
	 * Run the Cache getCache() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetCache_fixture_1()
		throws Exception {
		MailCache fixture2 = getFixture();

		Cache result = fixture2.getCache();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the List getChildKeys(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture_1()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);

		List result = fixture2.getChildKeys(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getChildKeys(MailCache.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the List getChildKeys(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture_2()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);

		List result = fixture2.getChildKeys(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getChildKeys(MailCache.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the List getChildKeys(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetChildKeys_fixture_3()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);

		List result = fixture2.getChildKeys(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getChildKeys(MailCache.java:79)
		assertNotNull(result);
	}

	/**
	 * Run the Object getElement(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetElement_fixture_1()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(-1);

		Object result = fixture2.getElement(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getElement(MailCache.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the Object getElement(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetElement_fixture_2()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(0);

		Object result = fixture2.getElement(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getElement(MailCache.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the Object getElement(Integer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	public void testGetElement_fixture_3()
		throws Exception {
		MailCache fixture2 = getFixture();
		Integer id = new Integer(1);

		Object result = fixture2.getElement(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at ch.bluepenguin.email.client.cache.MailCache.getElement(MailCache.java:66)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 6/7/15 3:11 PM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}
}