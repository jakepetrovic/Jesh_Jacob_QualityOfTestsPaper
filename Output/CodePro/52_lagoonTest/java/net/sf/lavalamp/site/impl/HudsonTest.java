package net.sf.lavalamp.site.impl;

import java.io.IOException;
import org.junit.*;
import net.sf.lavalamp.site.Build;
import net.sf.lavalamp.site.LoginRequiredException;
import static org.junit.Assert.*;

/**
 * The class <code>HudsonTest</code> contains tests for the class <code>{@link Hudson}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class HudsonTest {
	/**
	 * Run the Hudson() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testHudson_1()
		throws Exception {
		Hudson result = new Hudson();
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
		Hudson fixture = new Hudson();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getLastSuccessfulBuildUrl(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetLastSuccessfulBuildUrl_1()
		throws Exception {
		Hudson fixture = new Hudson();
		Build build = new Build("");

		String result = fixture.getLastSuccessfulBuildUrl(build);

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
		Hudson fixture = new Hudson();
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
		Hudson fixture = new Hudson();
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
		Hudson fixture = new Hudson();
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
	public void testWasLastBuildSuccessful_4()
		throws Exception {
		Hudson fixture = new Hudson();
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
	public void testWasLastBuildSuccessful_5()
		throws Exception {
		Hudson fixture = new Hudson();
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
	public void testWasLastBuildSuccessful_6()
		throws Exception {
		Hudson fixture = new Hudson();
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
		new org.junit.runner.JUnitCore().run(HudsonTest.class);
	}
}