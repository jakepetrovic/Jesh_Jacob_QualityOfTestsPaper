package net.sf.lavalamp.site.impl;

import org.junit.*;
import net.sf.lavalamp.site.Build;
import static org.junit.Assert.*;

/**
 * The class <code>Bamboo3RestApiTest</code> contains tests for the class <code>{@link Bamboo3RestApi}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class Bamboo3RestApiTest {
	/**
	 * Run the Bamboo3RestApi() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBamboo3RestApi_1()
		throws Exception {
		Bamboo3RestApi result = new Bamboo3RestApi();
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
		Bamboo3RestApi fixture = new Bamboo3RestApi();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertEquals("null/rest/api/latest/result/?expand=results%5B0%5D.result", result);
	}

	/**
	 * Run the String getLastBuildUrl(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetLastBuildUrl_2()
		throws Exception {
		Bamboo3RestApi fixture = new Bamboo3RestApi();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertEquals("null/rest/api/latest/result/?expand=results%5B0%5D.result", result);
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
		new org.junit.runner.JUnitCore().run(Bamboo3RestApiTest.class);
	}
}