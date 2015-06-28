package net.sf.lavalamp.site;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BuildsTest</code> contains tests for the class <code>{@link Builds}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BuildsTest {
	/**
	 * Run the Builds() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBuilds_1()
		throws Exception {

		Builds result = new Builds();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.allSuccessful());
	}

	/**
	 * Run the void add(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		Build build = new Build("");

		fixture.add(build);

		// add additional test code here
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testAllSuccessful_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testAllSuccessful_2()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean allSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testAllSuccessful_3()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		boolean result = fixture.allSuccessful();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuild_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<font color='green'> build  successful (null)</font>", result.toString());
		assertEquals(null, result.getBuildSite());
		assertEquals(true, result.isSuccessful());
		assertEquals("", result.getIdentity());
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuild_2()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<font color='green'> build  successful (null)</font>", result.toString());
		assertEquals(null, result.getBuildSite());
		assertEquals(true, result.isSuccessful());
		assertEquals("", result.getIdentity());
	}

	/**
	 * Run the Build getBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuild_3()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));
		String buildId = "";

		Build result = fixture.getBuild(buildId);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<font color='green'> build  successful (null)</font>", result.toString());
		assertEquals(null, result.getBuildSite());
		assertEquals(true, result.isSuccessful());
		assertEquals("", result.getIdentity());
	}

	/**
	 * Run the List<Build> getBuilds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuilds_1()
		throws Exception {
		Builds fixture = new Builds();
		fixture.add(new Build(""));

		List<Build> result = fixture.getBuilds();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
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
		new org.junit.runner.JUnitCore().run(BuildsTest.class);
	}
}