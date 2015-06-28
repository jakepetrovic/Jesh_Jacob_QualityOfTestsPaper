package org.databene.jdbacl.identity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NKBuilderTest</code> contains tests for the class <code>{@link NKBuilder}</code>.
 *
 * @generatedBy CodePro at 6/7/15 8:01 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class NKBuilderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see NKBuilder
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	private NKBuilder fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see NKBuilder
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public NKBuilder getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new NKBuilder();
		}
		return fixture;
	}

	/**
	 * Run the NKBuilder() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testNKBuilder_1()
		throws Exception {

		NKBuilder result = new NKBuilder();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
	}

	/**
	 * Run the void addComponent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddComponent_fixture_1()
		throws Exception {
		NKBuilder fixture2 = getFixture();
		Object component = "1";

		fixture2.addComponent(component);

		// add additional test code here
	}

	/**
	 * Run the void addComponent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testAddComponent_fixture_2()
		throws Exception {
		NKBuilder fixture2 = getFixture();
		Object component = null;

		fixture2.addComponent(component);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		NKBuilder fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
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
	 * @generatedBy CodePro at 6/7/15 8:01 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NKBuilderTest.class);
	}
}