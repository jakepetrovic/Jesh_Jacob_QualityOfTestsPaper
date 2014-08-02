package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SitePropertiesTest</code> contains tests for the class <code>{@link SiteProperties}</code>.
 *
 * @generatedBy CodePro at 4/8/14 10:32 AM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class SitePropertiesTest {
	/**
	 * Run the SiteProperties() constructor test.
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSiteProperties_1()
		throws Exception {
		SiteProperties result = new SiteProperties();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String getClassName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetClassName_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");

		String result = fixture.getClassName();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getGetterClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetGetterClass_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");

		String result = fixture.getGetterClass();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testGetUrl_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");

		String result = fixture.getUrl();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void setClassName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetClassName_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");
		String className = "";

		fixture.setClassName(className);

		// add additional test code here
	}

	/**
	 * Run the void setGetterClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetGetterClass_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");
		String getterClass = "";

		fixture.setGetterClass(getterClass);

		// add additional test code here
	}

	/**
	 * Run the void setUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/8/14 10:32 AM
	 */
	@Test
	public void testSetUrl_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");
		String url = "";

		fixture.setUrl(url);

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
		SiteProperties fixture = new SiteProperties();
		fixture.setUrl("");
		fixture.setClassName("");
		fixture.setGetterClass("");

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
		new org.junit.runner.JUnitCore().run(SitePropertiesTest.class);
	}
}