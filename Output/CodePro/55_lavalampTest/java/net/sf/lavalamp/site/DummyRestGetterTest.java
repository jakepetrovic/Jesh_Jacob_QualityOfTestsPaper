package net.sf.lavalamp.site;

import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DummyRestGetterTest</code> contains tests for the class <code>{@link DummyRestGetter}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:16 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class DummyRestGetterTest {
	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testGet_1()
		throws Exception {
		DummyRestGetter fixture = new DummyRestGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test(expected = net.sf.lavalamp.site.LoginRequiredException.class)
	public void testGet_2()
		throws Exception {
		DummyRestGetter fixture = new DummyRestGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";

		String result = fixture.get(url);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String get(String,char[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:16 PM
	 */
	@Test
	public void testGet_3()
		throws Exception {
		DummyRestGetter fixture = new DummyRestGetter();
		fixture.credentials = new UsernamePasswordCredentials();
		String url = "";
		char[] sensitive = new char[] {};

		String result = fixture.get(url, sensitive);

		// add additional test code here
		assertEquals("<auth>auth12345</auth>", result);
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
		new org.junit.runner.JUnitCore().run(DummyRestGetterTest.class);
	}
}