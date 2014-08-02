package net.sf.lavalamp.site;

import org.apache.commons.httpclient.UsernamePasswordCredentials;
import net.sf.lavalamp.site.impl.BambooRemoteApi;
import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import static org.junit.Assert.*;

/**
 * The class <code>AuthBuildSiteTest</code> contains tests for the class <code>{@link AuthBuildSite}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class AuthBuildSiteTest {
	/**
	 * Run the void clearCredentials() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testClearCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();

		fixture.clearCredentials();

		// add additional test code here
	}

	/**
	 * Run the UsernamePasswordCredentials getCredentials() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();

		UsernamePasswordCredentials result = fixture.getCredentials();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setCredentials(Console) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		Console console = new Console();

		fixture.setCredentials(console);

		// add additional test code here
	}

	/**
	 * Run the void setCredentials(String,UsernamePasswordCredentials) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetCredentials_2()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		String url = "";
		UsernamePasswordCredentials credentials = new UsernamePasswordCredentials();

		fixture.setCredentials(url, credentials);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AuthBuildSiteTest.class);
	}
}