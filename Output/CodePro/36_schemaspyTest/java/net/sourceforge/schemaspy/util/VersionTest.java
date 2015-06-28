package net.sourceforge.schemaspy.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VersionTest</code> contains tests for the class <code>{@link Version}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class VersionTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see Version
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private Version fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see Version
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public Version getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new Version("1");
		}
		return fixture;
	}

	/**
	 * Run the Version(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testVersion_1()
		throws Exception {
		String version = "1";

		Version result = new Version(version);

		// add additional test code here
		assertNotNull(result);
		assertEquals("1", result.toString());
	}

	/**
	 * Run the Version(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testVersion_2()
		throws Exception {
		String version = null;

		Version result = new Version(version);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
	}

	/**
	 * Run the int compareTo(Version) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testCompareTo_fixture_1()
		throws Exception {
		Version fixture2 = getFixture();
		Version other = new Version("1");

		int result = fixture2.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testEquals_fixture_1()
		throws Exception {
		Version fixture2 = getFixture();
		Object other = "1";

		boolean result = fixture2.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testEquals_fixture_2()
		throws Exception {
		Version fixture2 = getFixture();
		Object other = null;

		boolean result = fixture2.equals(other);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testEquals_fixture_3()
		throws Exception {
		Version fixture2 = getFixture();
		Object other = new Version("1");

		boolean result = fixture2.equals(other);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testHashCode_fixture_1()
		throws Exception {
		Version fixture2 = getFixture();

		int result = fixture2.hashCode();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testToString_fixture_1()
		throws Exception {
		Version fixture2 = getFixture();

		String result = fixture2.toString();

		// add additional test code here
		assertEquals("1", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
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
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VersionTest.class);
	}
}