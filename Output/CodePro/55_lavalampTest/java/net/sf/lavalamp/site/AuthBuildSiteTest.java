package net.sf.lavalamp.site;

import org.apache.commons.httpclient.UsernamePasswordCredentials;
import net.sf.lavalamp.site.impl.BambooRemoteApi;
import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import static org.junit.Assert.*;

/**
 * The class <code>AuthBuildSiteTest</code> contains tests for the class <code>{@link AuthBuildSite}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AuthBuildSiteTest {
	/**
	 * Run the void clearCredentials() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testClearCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		fixture.url = "";

		fixture.clearCredentials();

		// add additional test code here
	}

	/**
	 * Run the UsernamePasswordCredentials getCredentials() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		fixture.url = "";

		UsernamePasswordCredentials result = fixture.getCredentials();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setCredentials(Console) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetCredentials_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		Console console = new Console();

		fixture.setCredentials(console);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.Console.readLine(Console.java:8)
		//       at net.sf.lavalamp.site.AuthBuildSite.setCredentials(AuthBuildSite.java:17)
	}

	/**
	 * Run the void setCredentials(String,UsernamePasswordCredentials) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetCredentials_2()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.urlGetter = new DummyRemoteGetter();
		fixture.logger = new LavaLogger();
		fixture.url = "";
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
		new org.junit.runner.JUnitCore().run(AuthBuildSiteTest.class);
	}
}