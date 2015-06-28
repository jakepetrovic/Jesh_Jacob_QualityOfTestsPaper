package net.sf.lavalamp.site.impl;

import org.junit.*;
import net.sf.lavalamp.site.Build;
import static org.junit.Assert.*;

/**
 * The class <code>BambooRestApiTest</code> contains tests for the class <code>{@link BambooRestApi}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BambooRestApiTest {
	/**
	 * Run the BambooRestApi() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBambooRestApi_1()
		throws Exception {
		BambooRestApi result = new BambooRestApi();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getLastBuildUrl(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetLastBuildUrl_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertEquals("null/rest/api/latest/build//latest", result);
	}

	/**
	 * Run the String setCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		String prefix = "";
		String authType = "";

		String result = fixture.setCredentials(prefix, authType);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String setCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetCredentials_2()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		String prefix = "";
		String authType = "";

		String result = fixture.setCredentials(prefix, authType);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRestApi.wasLastBuildSuccessful(BambooRestApi.java:43)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_2()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRestApi.wasLastBuildSuccessful(BambooRestApi.java:43)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_3()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRestApi.wasLastBuildSuccessful(BambooRestApi.java:43)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_4()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRestApi.wasLastBuildSuccessful(BambooRestApi.java:43)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_5()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRestApi.wasLastBuildSuccessful(BambooRestApi.java:43)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BambooRestApiTest.class);
	}
}