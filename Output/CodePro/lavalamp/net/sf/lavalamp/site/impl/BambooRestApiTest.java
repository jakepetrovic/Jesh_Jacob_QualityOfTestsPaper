package net.sf.lavalamp.site.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.*;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.LoginRequiredException;
import static org.junit.Assert.*;

/**
 * The class <code>BambooRestApiTest</code> contains tests for the class <code>{@link BambooRestApi}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BambooRestApiTest {
	/**
	 * Run the BambooRestApi() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetLastBuildUrl_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String setCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		String prefix = "";
		String authType = "";

		String result = fixture.setCredentials(prefix, authType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String setCredentials(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetCredentials_2()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		String prefix = "";
		String authType = "";

		String result = fixture.setCredentials(prefix, authType);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testWasLastBuildSuccessful_1()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testWasLastBuildSuccessful_2()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.IOException.class)
	public void testWasLastBuildSuccessful_3()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testWasLastBuildSuccessful_4()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = java.io.UnsupportedEncodingException.class)
	public void testWasLastBuildSuccessful_5()
		throws Exception {
		BambooRestApi fixture = new BambooRestApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
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
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BambooRestApiTest.class);
	}
}