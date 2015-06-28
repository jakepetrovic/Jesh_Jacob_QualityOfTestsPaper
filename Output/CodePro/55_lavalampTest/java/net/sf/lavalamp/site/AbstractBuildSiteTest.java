package net.sf.lavalamp.site;

import org.junit.*;
import net.sf.lavalamp.LavaLogger;
import net.sf.lavalamp.site.impl.BambooRemoteApi;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractBuildSiteTest</code> contains tests for the class <code>{@link AbstractBuildSite}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class AbstractBuildSiteTest {
	/**
	 * Run the Getter getUrlGetter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetUrlGetter_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		Getter result = fixture.getUrlGetter();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLogin_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		fixture.login();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.login(BambooRemoteApi.java:34)
	}

	/**
	 * Run the void setProperties(SiteProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetProperties_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		SiteProperties serverProperties = new SiteProperties();
		serverProperties.setUrl("");

		fixture.setProperties(serverProperties);

		// add additional test code here
	}

	/**
	 * Run the void setUrlGetter(Getter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testSetUrlGetter_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();
		Getter urlGetter = new DummyRemoteGetter();

		fixture.setUrlGetter(urlGetter);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		fixture.logger = new LavaLogger();
		fixture.url = "";
		fixture.urlGetter = new DummyRemoteGetter();

		String result = fixture.toString();

		// add additional test code here
		assertEquals("build site ", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
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
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractBuildSiteTest.class);
	}
}