package org.jsecurity.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CollectionUtilsTest</code> contains tests for the class <code>{@link CollectionUtils}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class CollectionUtilsTest {
	/**
	 * Run the List<Object> asList(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsList_1()
		throws Exception {

		List<Object> result = CollectionUtils.asList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> asList(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsList_2()
		throws Exception {

		List<Object> result = CollectionUtils.asList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the List<Object> asList(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsList_3()
		throws Exception {

		List<Object> result = CollectionUtils.asList(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Object> asSet(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsSet_1()
		throws Exception {

		Set<Object> result = CollectionUtils.asSet();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Object> asSet(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsSet_2()
		throws Exception {

		Set<Object> result = CollectionUtils.asSet();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Set<Object> asSet(E[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testAsSet_3()
		throws Exception {

		Set<Object> result = CollectionUtils.asSet(null);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int computeListCapacity(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testComputeListCapacity_1()
		throws Exception {
		int arraySize = 1;

		int result = CollectionUtils.computeListCapacity(arraySize);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Collection<Object> emptyCollection(Class<E>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testEmptyCollection_1()
		throws Exception {
		Class<Object> clazz = Object.class;

		Collection<Object> result = CollectionUtils.emptyCollection(clazz);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
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
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CollectionUtilsTest.class);
	}
}