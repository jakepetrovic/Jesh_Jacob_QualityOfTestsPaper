package net.sf.lavalamp.site.impl;

import org.junit.*;
import net.sf.lavalamp.site.Build;
import static org.junit.Assert.*;

/**
 * The class <code>BambooRemoteApiTest</code> contains tests for the class <code>{@link BambooRemoteApi}</code>.
 *
 * @generatedBy CodePro at 5/28/15 8:15 PM
 * @author Jesh
 * @version $Revision: 1.0 $
 */
public class BambooRemoteApiTest {
	/**
	 * Run the BambooRemoteApi() constructor test.
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testBambooRemoteApi_1()
		throws Exception {
		BambooRemoteApi result = new BambooRemoteApi();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the String findAuth(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testFindAuth_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		String response = "";

		String result = fixture.findAuth(response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: No match found
		//       at java.util.regex.Matcher.group(Matcher.java:485)
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.findAuth(BambooRemoteApi.java:46)
		assertNotNull(result);
	}

	/**
	 * Run the String getAuthenticationKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetAuthenticationKey_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();

		String result = fixture.getAuthenticationKey();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getLastBuildUrl(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetLastBuildUrl_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		String result = fixture.getLastBuildUrl(build);

		// add additional test code here
		assertEquals("null/api/rest/getLatestBuildResults.action?buildKey=&auth=null", result);
	}

	/**
	 * Run the String getLoginUrl(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testGetLoginUrl_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		String userid = "";

		String result = fixture.getLoginUrl(userid);

		// add additional test code here
		assertEquals("null/api/rest/login.action?username=&password=", result);
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

		fixture.login();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.login(BambooRemoteApi.java:34)
	}

	/**
	 * Run the void login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLogin_2()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();

		fixture.login();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.login(BambooRemoteApi.java:34)
	}

	/**
	 * Run the void login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLogin_3()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();

		fixture.login();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.login(BambooRemoteApi.java:34)
	}

	/**
	 * Run the void login() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testLogin_4()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();

		fixture.login();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.login(BambooRemoteApi.java:34)
	}

	/**
	 * Run the boolean wasBuildSuccessful(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasBuildSuccessful_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		String response = "";

		boolean result = fixture.wasBuildSuccessful(response);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean wasBuildSuccessful(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasBuildSuccessful_2()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		String response = "";

		boolean result = fixture.wasBuildSuccessful(response);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean wasBuildSuccessful(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasBuildSuccessful_3()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		String response = "";

		boolean result = fixture.wasBuildSuccessful(response);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_1()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_2()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_3()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_4()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_5()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_6()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
	}

	/**
	 * Run the boolean wasLastBuildSuccessful(Build) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/28/15 8:15 PM
	 */
	@Test
	public void testWasLastBuildSuccessful_7()
		throws Exception {
		BambooRemoteApi fixture = new BambooRemoteApi();
		Build build = new Build("");

		boolean result = fixture.wasLastBuildSuccessful(build);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at net.sf.lavalamp.site.impl.BambooRemoteApi.wasLastBuildSuccessful(BambooRemoteApi.java:63)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(BambooRemoteApiTest.class);
	}
}