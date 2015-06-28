package net.sourceforge.schemaspy.util;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PasswordReaderTest</code> contains tests for the class <code>{@link PasswordReader}</code>.
 *
 * @generatedBy CodePro at 6/7/15 4:19 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class PasswordReaderTest {
	/**
	 * An instance of the class being tested.
	 *
	 * @see PasswordReader
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private PasswordReader fixtureInstance;

	/**
	 * An instance of the class being tested.
	 *
	 * @see PasswordReader
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	private PasswordReader fixture;

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PasswordReader
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public PasswordReader getFixtureInstance()
		throws Exception {
		if (fixtureInstance == null) {
			fixtureInstance = PasswordReader.getInstance();
		}
		return fixtureInstance;
	}

	/**
	 * Return an instance of the class being tested.
	 *
	 * @return an instance of the class being tested
	 *
	 * @see PasswordReader
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	public PasswordReader getFixture()
		throws Exception {
		if (fixture == null) {
			fixture = new PasswordReader();
		}
		return fixture;
	}

	/**
	 * Run the PasswordReader() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testPasswordReader_1()
		throws Exception {

		PasswordReader result = new PasswordReader();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the PasswordReader getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		PasswordReader result = PasswordReader.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the char[] readPassword(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testReadPassword_fixtureInstance_1()
		throws Exception {
		PasswordReader fixture2 = getFixtureInstance();
		String fmt = "";
		Object arg1 = new Object();
		Object arg2 = null;

		char[] result = fixture2.readPassword(fmt, arg1, arg2);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the char[] readPassword(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testReadPassword_fixture_1()
		throws Exception {
		PasswordReader fixture2 = getFixture();
		String fmt = "0123456789";
		Object arg1 = new Object();
		Object arg2 = null;

		char[] result = fixture2.readPassword(fmt, arg1, arg2);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the char[] readPassword(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testReadPassword_fixture_2()
		throws Exception {
		PasswordReader fixture2 = getFixture();
		String fmt = "";
		Object arg1 = new Object();
		Object arg2 = null;

		char[] result = fixture2.readPassword(fmt, arg1, arg2);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the char[] readPassword(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 6/7/15 4:19 PM
	 */
	@Test
	public void testReadPassword_fixtureInstance_2()
		throws Exception {
		PasswordReader fixture2 = getFixtureInstance();
		String fmt = "0123456789";
		Object arg1 = new Object();
		Object arg2 = null;

		char[] result = fixture2.readPassword(fmt, arg1, arg2);

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(PasswordReaderTest.class);
	}
}