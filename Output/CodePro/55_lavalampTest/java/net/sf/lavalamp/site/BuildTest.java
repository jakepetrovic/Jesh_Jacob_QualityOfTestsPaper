package net.sf.lavalamp.site;

import org.junit.*;
import net.sf.lavalamp.site.impl.BambooRemoteApi;
import static org.junit.Assert.*;

/**
 * The class <code>BuildTest</code> contains tests for the class <code>{@link Build}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BuildTest {
	/**
	 * Run the Build(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testBuild_1()
		throws Exception {
		String identity = "";

		Build result = new Build(identity);

		// add additional test code here
		assertNotNull(result);
		assertEquals("<font color='green'> build  successful (null)</font>", result.toString());
		assertEquals(null, result.getBuildSite());
		assertEquals(true, result.isSuccessful());
		assertEquals("", result.getIdentity());
	}

	/**
	 * Run the BuildSite getBuildSite() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetBuildSite_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);

		BuildSite result = fixture.getBuildSite();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCredentials());
		assertEquals(null, result.getUrlGetter());
	}

	/**
	 * Run the String getIdentity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetIdentity_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);

		String result = fixture.getIdentity();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsSuccessful_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);

		boolean result = fixture.isSuccessful();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isSuccessful() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testIsSuccessful_2()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(false);

		boolean result = fixture.isSuccessful();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setBuildSite(BuildSite) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetBuildSite_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);
		BuildSite buildServer = new BambooRemoteApi();

		fixture.setBuildSite(buildServer);

		// add additional test code here
	}

	/**
	 * Run the void setSuccessful(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetSuccessful_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);
		boolean isSuccessful = true;

		fixture.setSuccessful(isSuccessful);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(true);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("<font color='green'> build  successful (build site null)</font>", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		Build fixture = new Build("");
		fixture.setBuildSite(new BambooRemoteApi());
		fixture.setSuccessful(false);

		String result = fixture.toString();

		// add additional test code here
		assertEquals("<font color='red'> build  failed (build site null)</font>", result);
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
		new org.junit.runner.JUnitCore().run(BuildTest.class);
	}
}