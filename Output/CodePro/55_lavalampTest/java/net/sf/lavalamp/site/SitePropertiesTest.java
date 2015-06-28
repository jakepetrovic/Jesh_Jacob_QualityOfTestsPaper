package net.sf.lavalamp.site;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SitePropertiesTest</code> contains tests for the class <code>{@link SiteProperties}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class SitePropertiesTest {
	/**
	 * Run the SiteProperties() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
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
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetClassName_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");

		String result = fixture.getClassName();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getGetterClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetGetterClass_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");

		String result = fixture.getGetterClass();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getUrl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGetUrl_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");

		String result = fixture.getUrl();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the void setClassName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetClassName_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");
		String className = "";

		fixture.setClassName(className);

		// add additional test code here
	}

	/**
	 * Run the void setGetterClass(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetGetterClass_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");
		String getterClass = "";

		fixture.setGetterClass(getterClass);

		// add additional test code here
	}

	/**
	 * Run the void setUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testSetUrl_1()
		throws Exception {
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");
		String url = "";

		fixture.setUrl(url);

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
		SiteProperties fixture = new SiteProperties();
		fixture.setClassName("");
		fixture.setGetterClass("");
		fixture.setUrl("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("\n\t\t\tserver=, url= getter=", result);
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
		new org.junit.runner.JUnitCore().run(SitePropertiesTest.class);
	}
}