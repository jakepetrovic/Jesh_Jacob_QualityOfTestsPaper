package net.sourceforge.schemaspy.util;

import java.util.HashMap;
import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaseInsensitiveMapTest</code> contains tests for the class <code>{@link CaseInsensitiveMap}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:24 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class CaseInsensitiveMapTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see CaseInsensitiveMap
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	private CaseInsensitiveMap fixture1;

	/**
	 * An instance of the class being tested.
	 *
	 * @see CaseInsensitiveMap
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	private CaseInsensitiveMap fixture2;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see CaseInsensitiveMap
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	public CaseInsensitiveMap getFixture1()
		throws Exception {
		if (fixture1 == null) {
			fixture1 = new CaseInsensitiveMap();
		}
		return fixture1;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see CaseInsensitiveMap
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	public CaseInsensitiveMap getFixture2()
		throws Exception {
		if (fixture2 == null) {
			fixture2 = new CaseInsensitiveMap(0);
		}
		return fixture2;
	}

	/**
	 * Run the CaseInsensitiveMap() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testCaseInsensitiveMap_1()
		throws Exception {

		CaseInsensitiveMap result = new CaseInsensitiveMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CaseInsensitiveMap(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testCaseInsensitiveMap_2()
		throws Exception {
		int initialCapacity = 0;

		CaseInsensitiveMap result = new CaseInsensitiveMap(initialCapacity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CaseInsensitiveMap(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testCaseInsensitiveMap_3()
		throws Exception {
		int initialCapacity = 1;

		CaseInsensitiveMap result = new CaseInsensitiveMap(initialCapacity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the CaseInsensitiveMap(int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testCaseInsensitiveMap_4()
		throws Exception {
		int initialCapacity = 7;

		CaseInsensitiveMap result = new CaseInsensitiveMap(initialCapacity);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testContainsKey_fixture1_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "";

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testContainsKey_fixture2_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "0123456789";

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testContainsKey_fixture2_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "";

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsKey(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testContainsKey_fixture1_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "0123456789";

		boolean result = fixture.containsKey(key);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testGet_fixture1_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "";

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testGet_fixture2_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "0123456789";

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testGet_fixture2_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "";

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testGet_fixture1_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "0123456789";

		Object result = fixture.get(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testRemove_fixture1_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "";

		Object result = fixture.remove(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testRemove_fixture2_1()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "0123456789";

		Object result = fixture.remove(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testRemove_fixture2_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture2();
		Object key = "";

		Object result = fixture.remove(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Object remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	@Test
	public void testRemove_fixture1_2()
		throws Exception {
		CaseInsensitiveMap fixture = getFixture1();
		Object key = "0123456789";

		Object result = fixture.remove(key);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:24 PM
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
	 * @generatedBy CodePro at 6/7/15 4:24 PM
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
	 * @generatedBy CodePro at 6/7/15 4:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CaseInsensitiveMapTest.class);
	}
}