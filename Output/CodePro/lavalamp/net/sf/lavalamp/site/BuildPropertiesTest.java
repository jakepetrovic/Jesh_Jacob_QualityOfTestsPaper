package net.sf.lavalamp.site;

import org.junit.*;
import net.sf.lavalamp.properties.MissingPropertyException;
import static org.junit.Assert.*;

/**
 * The class <code>BuildPropertiesTest</code> contains tests for the class <code>{@link BuildProperties}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class BuildPropertiesTest {
	/**
	 * Run the BuildProperties() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testBuildProperties_1()
		throws Exception {
		BuildProperties result = new BuildProperties();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testCheck_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the void check() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test(expected = net.sf.lavalamp.properties.MissingPropertyException.class)
	public void testCheck_2()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild((String) null);

		fixture.check();

		// add additional test code here
	}

	/**
	 * Run the String getBuild() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetBuild_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");

		String result = fixture.getBuild();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the SiteProperties getSiteProperties() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetSiteProperties_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");

		SiteProperties result = fixture.getSiteProperties();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setBuild(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetBuild_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");
		String build = "";

		fixture.setBuild(build);

		// add additional test code here
	}

	/**
	 * Run the void setSiteProperties(SiteProperties) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetSiteProperties_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");
		SiteProperties siteProperties = new SiteProperties();

		fixture.setSiteProperties(siteProperties);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		BuildProperties fixture = new BuildProperties();
		fixture.setSiteProperties(new SiteProperties());
		fixture.setBuild("");

		String result = fixture.toString();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(BuildPropertiesTest.class);
	}
}